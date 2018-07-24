package org.shao.convertor;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;
import org.shao.dataobject.OrderDetail;
import org.shao.dto.OrderDTO;
import org.shao.enums.ResultEnum;
import org.shao.exception.SellException;
import org.shao.form.OrderForm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hmh on 2018/7/22.
 * @author hmh
 */
@Slf4j
public class OrderForm2OrderDTOConvertor {

    public static OrderDTO convert(OrderForm orderForm) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();
        Gson gson = new Gson();
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {
                    }.getType());

        } catch (Exception e) {
            log.error("[对象转换] 错误, string={}", orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }

        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }

}

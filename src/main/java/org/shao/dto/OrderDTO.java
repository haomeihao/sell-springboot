package org.shao.dto;

import lombok.Data;
import org.shao.dataobject.OrderDetail;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by hmh on 2018/7/22.
 * @author hmh
 */
@Data
public class OrderDTO {

    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Integer orderStatus;

    private Integer payStatus;

    private Date createTime;

    private Date updateTime;

    private List<OrderDetail> orderDetailList;

}

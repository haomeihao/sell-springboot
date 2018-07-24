package org.shao.service;

import org.shao.dto.OrderDTO;

/**
 * 买家
 * Created by hmh on 2018/7/24.
 * @author hmh
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);

}

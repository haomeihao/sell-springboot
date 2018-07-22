package org.shao.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 订单状态枚举
 * Created by hmh on 2018/7/22.
 * @author hmh
 */
@Getter
@AllArgsConstructor
public enum  OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消")
    ;

    private Integer code;

    private String message;


}

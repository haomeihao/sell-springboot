package org.shao.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 订单支付状态枚举
 * Created by hmh on 2018/7/22.
 * @author hmh
 */
@Getter
@AllArgsConstructor
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;

    private String message;


}

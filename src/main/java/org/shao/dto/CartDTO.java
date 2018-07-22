package org.shao.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 购物车
 * Created by hmh on 2018/7/22.
 * @author hmh
 */
@Data
@AllArgsConstructor
public class CartDTO {

    private String productId;

    private Integer productQuantity;
}

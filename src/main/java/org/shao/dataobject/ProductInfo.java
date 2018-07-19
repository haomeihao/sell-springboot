package org.shao.dataobject;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 商品
 * Created by hmh on 2018/7/19.
 * @author hmh
 */
@Data
@ToString
@Entity
public class ProductInfo {

    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDescription;

    private String productIcon;

    /** 状态 默认0正常 1下架 */
    private Integer productStatus;

    private Integer categoryType;
}

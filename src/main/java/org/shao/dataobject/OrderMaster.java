package org.shao.dataobject;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;
import org.shao.enums.OrderStatusEnum;
import org.shao.enums.PayStatusEnum;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by hmh on 2018/7/22.
 * @author hmh
 */
@Data
@ToString
@Entity
@DynamicUpdate
public class OrderMaster {

    @Id
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    private Date createTime;

    private Date updateTime;

//    @Transient
//    private List<OrderDetail> orderDetailList;

}

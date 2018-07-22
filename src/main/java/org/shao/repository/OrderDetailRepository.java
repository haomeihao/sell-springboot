package org.shao.repository;

import org.shao.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by hmh on 2018/7/22.
 * @author hmh
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String>{

    List<OrderDetail> findByOrderId(String orderId);

}

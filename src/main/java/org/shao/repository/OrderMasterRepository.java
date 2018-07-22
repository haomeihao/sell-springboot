package org.shao.repository;

import org.shao.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hmh on 2018/7/22.
 * @author hmh
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String>{

    Page<OrderMaster> findByBuyerOpenid(String openid, Pageable pageable);

}

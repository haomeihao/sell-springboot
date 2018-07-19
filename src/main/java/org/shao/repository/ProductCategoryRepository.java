package org.shao.repository;

import org.shao.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by hmh on 2018/7/18.
 * @author hmh
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    /**
     * findByCategoryTypeIn
     * @param categoryList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryList);
}

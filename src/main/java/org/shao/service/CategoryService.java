package org.shao.service;

import org.shao.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * Created by hmh on 2018/7/18.
 * @author hmh
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}

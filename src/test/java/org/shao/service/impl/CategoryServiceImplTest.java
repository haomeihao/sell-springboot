package org.shao.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.shao.dataobject.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hmh on 2018/7/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() throws Exception {
        ProductCategory result = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1), result.getCategoryId());
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> result = categoryService.findAll();
        Assert.assertNotEquals(0, result.size());
    }

    @Test
    public void findByCategoryIn() throws Exception {
        List<ProductCategory> result = categoryService.findByCategoryIn(Arrays.asList(1,2,3));
        Assert.assertNotEquals(0, result.size());
    }

    @Test
    public void save() throws Exception {
        ProductCategory productCategory = new ProductCategory("女生最爱", 4);
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertNotNull(result);
    }

}
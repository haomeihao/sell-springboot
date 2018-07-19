package org.shao.controller;

import org.shao.vo.ProductVO;
import org.shao.vo.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 买家端商品接口
 * Created by hmh on 2018/7/19.
 * @author hmh
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("/list")
    public ResultVO list() {
        ResultVO resultVO = new ResultVO();

        ProductVO productVO = new ProductVO();

        resultVO.setCode(0);
        resultVO.setMsg("成功");

        return resultVO;
    }

}

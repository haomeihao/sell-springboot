package org.shao.exception;

import org.shao.enums.ResultEnum;

/**
 * Created by hmh on 2018/7/22.
 * @author hmh
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}

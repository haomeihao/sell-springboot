package org.shao.vo;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * Created by hmh on 2018/7/19.
 * @author hmh
 */
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO<T> {

    /** 错误码 */
    private Integer code;

    /** 提示信息 */
    private String msg;

    /** 具体数据 */
    private T data;

}

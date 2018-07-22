package org.shao.utils;

import java.util.Random;

/**
 * Created by hmh on 2018/7/22.
 * @author hmh
 */
public class KeyUtil {

    /**
     * 生成唯一的组件
     * 格式：时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }

}

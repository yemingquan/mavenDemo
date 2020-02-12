package com.web.demo.util;

import lombok.extern.java.Log;

/**
 * @所属模块
 * @描述
 * @创建人 yemq
 * @创建时间 2020/2/2
 * @备注
 */
@Log
public class Util {
    public static void show(Object o) {
        log.info(o.toString());
    }

    public static void showNum(Double d) {
        int count = 0;
        Double num = 0d;
        do {
            num = d;
            count++;
            d = d / 1000;
        } while (d < 0);
//        千（1000） 百万（1000*1000） 十亿（1000*1000*1000）万亿（1000*1000*1000*1000）
        String str = "";
        if (count > 4) {
            str = num + "万亿";
        } else if (count > 3) {
            str = num + "十亿";
        } else if (count > 3) {
            str = num + "百万";
        } else if (count > 3) {
            str = num + "千";
        } else {
            str += num;
        }
        log.info(str);
    }
}

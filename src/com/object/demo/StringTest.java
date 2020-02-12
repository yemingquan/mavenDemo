package com.object.demo;

import java.util.Arrays;

/**
 * @所属模块
 * @描述
 * @创建人 yemq
 * @创建时间 2020/2/2
 * @备注
 */
public class StringTest {
    static String s = "" + Byte.MAX_VALUE;

    public static void main(String[] args) throws Exception {
//        transString();
    }


    /**
     * @描述 字符串与数字之间的转换(注意值)
     * @创建人 yemq
     * @创建时间 2020/2/2
     * @备注
     */
    private static void transString() {
//        转换成数字
//        1.分装类解析(可以指定进制)
        Byte b = Byte.parseByte(s, 10);
        int i = Integer.parseInt(s);
        long l = Long.parseLong(s);
        float f = Float.parseFloat(s);
        Double d = Double.parseDouble(s);
//        2.以数字字符串新建分装类对象
        double d2 = new Double(s);

//      转换成String
        s = "" + d;
        s = d.toString();
//        new String(char[]{'a','b','c'});
    }

}

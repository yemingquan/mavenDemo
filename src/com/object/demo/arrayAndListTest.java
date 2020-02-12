package com.object.demo;

import com.web.demo.util.Util;

import java.nio.ByteBuffer;
import java.util.*;

/**
 * @所属模块
 * @描述
 * @创建人 yemq
 * @创建时间 2020/2/2
 * @备注
 */
public class arrayAndListTest {
    public static void main(String[] args) throws Exception {
        arrayTest();
        listTest();
    }

    /**
     * @描述 集合
     * 大小可动态扩展，可以存储各种类型的数据
     * 可以存储任何类型的变量,只能放引用数据类型
     * 提供了排序的算法
     * @创建人 yemq
     * @创建时间 2020/2/3
     * @备注 set集合：集合中的对象不按特定顺序排列，不能重复。
     * list列表：有序，可以重复。
     * map映射：键不能重复，值可以重复
     */
    private static void listTest() {
        Arrays.asList(5, 3, 21, 4);
    }

    /**
     * @描述 数组
     * 大小固定(只要明确个数就可以新建)
     * 可以放的元素数据类型：可以是基本数据类型，引用数据类型
     * 排序需要自己定义算法
     * @创建人 yemq
     * @创建时间 2020/2/3
     * @备注
     */
    private static void arrayTest() {
//       数组构建
        Integer[] array = {1, 22222, 3, 4};

        Integer[] array2 = new Integer[5];
        Integer[] array3 = new Integer[]{1, 22222, 3, 4};

//       集合 asList参数必须是对象
        List<Integer> list;

//        数组转换其他
//        集合list 集合的类型必须为对象
        list = Arrays.asList(array);
//        集合set 集合的类型必须为对象
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(array));

        String str = array.toString();
//        转换为数组
        array = list.toArray(new Integer[list.size()]);

//        常见数组方法
//        转换成其他对象在判断是否有值
        Util.show(array.toString());
        Boolean b = array.toString().contains("22222");
        b = Arrays.asList(array).contains(22222);
        byte[] bytes = ByteBuffer.allocate(4).putInt(90).array();
        for (byte t : bytes) {
            System.out.format("0x%x ", t);  //0x0 0x0 0x0 0x5a
        }
    }
}

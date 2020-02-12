package com.object.demo;

import com.web.demo.util.Util;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

/**
 * @所属模块
 * @描述 描述byte int long float short double数据范围和相互转换
 * @创建人 yemq
 * @创建时间 2020/2/2
 * @备注
 */
public class BaseTypeTest {

    static byte b = 1;
    static int i = 1;
    static long l = 1l;
    static float f = 1f;
    static short s = 1;
    static double d = 1;

    /**
     * @描述 明确基本数据室类型的使用场景
     * <p>
     * byte(字节) 8 -128 - 127 0
     * short(短整型) 16 -32768 - 32768 0
     * int(整型) 32 -2147483648-2147483648 0
     * long(长整型) 64 -9233372036854477808-9233372036854477808 0
     * float(浮点型) 32 -3.40292347E+38-3.40292347E+38 0.0f
     * double(双精度) 64 -1.79769313486231570E+308-1.79769313486231570E+308 0.0d
     * char(字符型) 16 ‘ \u0000 - u\ffff ’ ‘\u0000 ’
     * boolean(布尔型) 1 true/false false
     * @创建人 yemq
     * @创建时间 2020/2/2
     * @备注 1.自动装箱问题Integer a = 200
     * 2.数字比较问题 基础数据== 对象则用equals
     * 3.数值转换问题
     * 4.基础数据类型与引用数据类型的区别
     */
    public static void main(String[] args) throws Exception {
//        byteTest();
//        intTest();
//        doubleTest();
//        charTest();

    }

    /**
     *@描述
     * 1.拥有大量字符判定的条件
     * 2.byte和String进行转换
     *@创建人 yemq
     *@创建时间 2020/2/2
     *@备注
     */
    private static void charTest() {
        String str="fdsf4245fe4";

        char[]  cha=str.toCharArray();
        System.out.println(cha);
        for (int i = 0; i < cha.length; i++) {
            if(Character.isLetter(cha[i]))
                System.out.println("第"+i+"个数是英文字母");
            if(Character.isDigit(cha[i]))
                System.out.println("第"+i+"个数是数字");
            if(Character.isUpperCase(cha[i]))
                System.out.println("第"+i+"个数是大写字母");
            if(Character.isLowerCase(cha[i]))
                System.out.println("第"+i+"个数是小写字母");
            if(Character.isWhitespace(cha[i]))
                System.out.println("第"+i+"个数是空格或换行符 ");
        }
    }

    /**
     * @描述 商业计算使用 BigDecimal 科学或者工程计算使用Double
     * 1.数据转换(除了基础数据外，还有BigDecimal、String)
     * @创建人 yemq
     * @创建时间 2020/2/2
     * @备注
     * 1.无法指定小数位数和小数方法
     * 2.使用double进行转换前最好先转成String(转换时，不要对数字使用new)
     */
    private static void doubleTest() {
//        1.无法指定小数位数和小数方法
        Double d = doubleQ1();
        List<Integer> s = Arrays.asList(1, 2, 3, 4);
    }

    /**
     * @描述 1.无法指定小数位数和小数方法
     * @创建人 yemq
     * @创建时间 2020/2/2
     * @备注
     */
    private static Double doubleQ1() {

        double d = 114.145;

//        使用Math转换为long
//        d = (double) Math.round(d * 100) / 100;
//          使用DecimalFormat 截取
//        DecimalFormat df = new DecimalFormat("#.00");
//        d = new Double(df.format(d));
//          使用String 四舍五入
//        d = new Double(String.format("%2.2f", d));
//        使用bigDecimal对象，设置小数位数和策略，转换为BigDecimal
//        d = new BigDecimal(""+d).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();

        Util.show(d);
        return d;
    }

    /**
     * @描述 java中的主要整数数字对象
     * 1.数据转换（包括jdk1.5的自动拆装箱，有空指针问题）
     * 2.进制转换
     * 3.值域
     * 4.数据操作（两个int值比大小，求和）
     * @创建人 yemq
     * @创建时间 2020/2/2
     * @备注
     */
    private static void intTest() {
//        1.自动装箱问题Integer a = 200
//        intQ1();
    }

    /**
     * @描述 1.自动装箱问题Integer a = 200
     * @创建人 yemq
     * @创建时间 2020/2/2
     * @备注
     */
    private static void intQ1() {
        Integer a = 200;
        Integer b = 200;
        Integer a1 = 2;
        Integer b1 = 2;
        System.out.println(a == b); //false   1
        System.out.println(a1 == b1); //true  2
    }

    /**
     * @描述 Byte 字节类型 B = 8b
     * byte用法
     * byte相关
     * 用作流的方式进行web数据传输，防止转换出现乱码
     * 流/文件 详见其他文件
     * @创建人 yemq
     * @创建时间 2020/2/2
     * @备注
     */
    private static void byteTest() throws Exception {
        // byte与String
//        byteToString();
//        byte与流
    }

    /**
     * @描述 byte与String
     * @创建人 yemq
     * @创建时间 2020/2/2
     * @备注
     */
    private static void byteToString() throws UnsupportedEncodingException {
        //String 和byte相互转换的示例
//       参数赋值 string ->byte[]
        String string = "hello 世界小姐";
//        byte[] bytes = string.getBytes();
        //以UTF-8的方式解析字符串为字节数组
        byte[] bytes = string.getBytes("GBK");
//      展示参数
        System.out.println("bytes-->" + Arrays.toString(bytes));
        //       参数赋值 byte[] ->string
        System.out.println("string-->" + new String(bytes));
    }


}

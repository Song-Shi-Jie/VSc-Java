/*
 * @Author: 宋世杰
 * @Date: 2023-03-27 17:19:08
 * @LastEditTime: 2023-03-27 20:02:07
 * @LastEditors: 宋世杰
 * @FilePath: \VSc-Java\WNLX\M3D27\Pra0304.java
 * @Description: 请自行修改描述
 */
package WNLX.M3D27;

public class Pra0304 {

    public static void main(String[] args) {
        String s = "123";
        byte b = Byte.parseByte(s);
        short sh = Short.parseShort(s);
        int i = Integer.parseInt(s);
        long l = Long.parseLong(s);
        float f = Float.parseFloat(s);
        double d = Double.parseDouble(s);
        char[] ch = s.toCharArray();
        String tmpch = "a";
        char c = tmpch.charAt(0);
        String s1 = "true";
        boolean bool = Boolean.parseBoolean(s1);
        System.out.println(b);
        System.out.println(sh);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(ch);
        System.out.println(bool);
        System.out.println(c);

        String t1 = String.valueOf(127);
        String t2 = String.valueOf(true);
        String t3 = String.valueOf('1');
        String t4 = String.valueOf(9999l);
        String t5 = String.valueOf(3.1415926);
        String t6 = String.valueOf(3.1415926f);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);

    }

}

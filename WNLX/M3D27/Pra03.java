/*
 * @Author: 宋世杰
 * @Date: 2023-03-27 19:07:51
 * @LastEditTime: 2023-03-27 19:09:57
 * @LastEditors: 宋世杰
 * @FilePath: \VSc-Java\WNLX\M3D27\Pra03.java
 * @Description: 请自行修改描述
 */
package WNLX.M3D27;

public class Pra03 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1);
        System.out.println(obj1.hashCode());
        System.out.println(obj2);
        System.out.println(obj2.hashCode());
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj1.equals(obj2));
    }
}

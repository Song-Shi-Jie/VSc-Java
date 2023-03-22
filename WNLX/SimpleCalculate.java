/*
 * @Author: 宋世杰
 * @Date: 2023-03-21 17:22:45
 * @LastEditTime: 2023-03-21 23:39:01
 * @LastEditors: 宋世杰
 * @FilePath: \VSc-Java\WNLX\SimpleCalculate.java
 * @Description: 该程序为简易计算器
 */

package WNLX;

import java.util.Scanner;

public class SimpleCalculate {
    /**
     * @description:
     * @param {String} num
     * @return {*}
     */
    static boolean isPureNumeric(String num) {
        if (num == null)
            return false;
        for (char cur : num.toCharArray()) {
            if (!Character.isDigit(cur))
                return false;
        }
        return true;
    }

    // 比较两个数的大小
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String tmp = s.nextLine();
        boolean flag = isPureNumeric(tmp);
        System.out.println(flag);

    }
}

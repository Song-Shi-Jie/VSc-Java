package WNLX;

import java.util.Scanner;

public class SimpleCalculate {
    static boolean isPureNumeric(String num) {
        if (num == null)
            return false;
        for (char cur : num.toCharArray()) {
            if (!Character.isDigit(cur))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String tmp = s.nextLine();
        boolean flag = isPureNumeric(tmp);
        System.out.println(flag);

    }
}

package WNLX;

import java.util.Random;
import java.util.Scanner;

public class Day04 {
    static void shuiXianHua() {
        for (int i = 1; i < 1000; i++) {
            int ge = i % 10;

            int shi = i / 10 % 10;
            int bai = i / 100;
            int total = (int) Math.pow(ge, 3) + (int) Math.pow(shi, 3) + (int) Math.pow(bai, 3);
            if (i == total)
                System.out.print(i + " ");
        }
    }

    static void Pra01() {
        for (int i = 1; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            int total = (ge + shi + bai) * 11;
            if (i == total)
                System.out.print(i + " ");
        }
    }

    static void Pra02() {
        for (int i = 10; i < 100; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int total = ge * 10 + shi;
            if (i + 36 == total)
                System.out.print(i + " ");
        }
    }

    static void Pra03() {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            if ((ge == 7 || shi == 7) && i % 7 != 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println(sum);
    }

    static void Pra04() {
        Scanner s1 = new Scanner(System.in);
        System.out.print("请输入一个四位数：");
        int vec = s1.nextInt();
        int res = 0;
        for (int i = 1; i <= 1000; i *= 10) {
            int tmp = (vec / i) % 10;
            res += tmp * (1000 / i);
        }
        System.out.println(res);
        s1.close();
    }

    static void Pra05() {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int t1 = s.nextInt();
        System.out.print("请输入第二个数：");
        int t2 = s.nextInt();
        System.out.print("请输入第三个数：");
        int t3 = s.nextInt();
        int tmp1 = t1 > t2 ? t1 : t2;
        int tmp2 = t3 > tmp1 ? t3 : tmp1;
        System.out.print(tmp2 + " ");
        int tmp3 = 0;
        int tmp4 = 0;
        if (tmp2 == t3)
            System.out.print(tmp1 + " ");
        else if (tmp1 == t1) {
            tmp3 = t3 > t2 ? t3 : t2;
            if (tmp3 == t3)
                tmp4 = t2;
            else
                tmp4 = t3;
            System.out.print(tmp3 + " " + tmp4);
        } else {
            tmp3 = t3 > t1 ? t3 : t1;
            if (tmp3 == t3)
                tmp4 = t1;
            else
                tmp4 = t3;
            System.out.print(tmp3 + " " + tmp4);
        }

        s.close();
    }

    static void Pra06() {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int t1 = s.nextInt();
        System.out.print("请输入第二个数：");
        int t2 = s.nextInt();
        int tmp = t1;
        t1 = t2;
        t2 = tmp;
        System.out.println(t1 + " " + t2);
        s.close();
    }

    static void Pra07() {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入整数：");
        int t1 = s.nextInt();
        if (t1 % 2 == 0) {
            System.out.println("不是质数");
            s.close();
            return;
        }
        for (int i = 2; i < Math.sqrt(t1); i++) {
            if (t1 % i == 0) {
                System.out.println("不是质数");
                s.close();
                return;
            }
        }
        System.out.println("是质数");
        s.close();
    }

    static int gcd1(int m, int n) {
        while (n != 0) {
            int rem = m % n;
            m = n;
            n = rem;
        }
        return m;
    }

    static int gcd2(int m, int n) {
        int range = m < n ? m : n;
        int tmp = 0;
        for (int i = 1; i <= range; i++) {
            if (m % i == 0 && n % i == 0) {
                tmp = i;
            }
        }
        return tmp;
    }

    static void Pra08() {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int t1 = s.nextInt();
        System.out.print("请输入第二个数：");
        int t2 = s.nextInt();
        int gys = gcd2(t1, t2);
        System.out.println("最大公约数为：" + gys);
        int gbs = (t1 * t2) / gys;
        System.out.println("最小公倍数为：" + gbs);
        s.close();
    }

    static void Prac09() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        char op = s.next().charAt(0);
        int b = s.nextInt();
        int sum = 0;
        switch (op) {
            case '+':
                sum = a + b;
                break;
            case '-':
                sum = a - b;
                break;
            case '*':
                sum = a * b;
                break;
            case '/':
                sum = a / b;
                break;
        }
        System.out.println(a + " " + op + " " + b + " = " + sum);
        s.close();
    }

    static void Pra10() {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int mycount = 0;
        int count = 0;
        while (true) {
            int sign = r.nextInt(3) + 1;
            String temp;
            if (sign == 1)
                temp = "石头";
            else if (sign == 2)
                temp = "剪刀";
            else
                temp = "布";
            System.out.println("你要出什么（1：石头；2：剪刀；3：布）：");
            int mysign = s.nextInt();
            System.out.println("电脑出" + temp);
            if (mysign == 1 || mysign == 2 || mysign == 3) {
                if (mysign == (sign + 1) % 3) {
                    // 你的数字在我的数后面
                    System.out.println("你输了...");
                    count++;
                } else if (mysign == sign) {
                    // 平局不算局数
                    System.out.println("平局");
                } else {
                    System.out.println("你赢了！");
                    mycount++;
                }
                if (mycount == 2) {
                    System.out.println("你最终赢了！");
                    break;
                } else if (count == 2) {
                    System.out.println("你最终输了...");
                    break;
                }
            } else
                System.out.println("输入错误，请输入1或2或3！！");
        }
        s.close();
    }

    static void Pra11() {
        for (int i = 1; i <= 4; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                int muti = i * j;
                System.out.print(i + " * " + j + " = " + muti + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Prac09();

    }

}

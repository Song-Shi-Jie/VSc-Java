package WNLX;

import java.util.Scanner;

public class D3_20 {
    static void input(String[] arr) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入员工编号：");
            String tmp1 = s.nextLine();
            System.out.println("请输入员工姓名：");
            String tmp2 = s.nextLine();
            System.out.println("请输入员工年龄：");
            String tmp3 = s.nextLine();
            System.out.println("请输入员工性别：");
            String tmp4 = s.nextLine();
            System.out.println("请输入员工籍贯：");
            String tmp5 = s.nextLine();

            String tmp = tmp1 + " " + tmp2 + " " + tmp3 + " " + tmp4 + " " + tmp5;
            arr[i] = tmp;

            clear();
        }

        s.close();
    }

    static void clear() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    static void searchIndex(String[] arr, int i) {
        String index = Integer.toString(i);
        // System.out.println(index);
        for (int j = 0; j < arr.length; j++) {
            String tmp1 = arr[j];
            String[] tmp2 = tmp1.split(" ");
            // output(tmp2);
            if (tmp2[0].equals(index)) {
                System.out.println(arr[j]);
                break;
            }
        }
    }

    static void changeSexByIndex(String[] arr, int i) {
        String index = Integer.toString(i);
        // System.out.println(index);
        for (int j = 0; j < arr.length; j++) {
            String tmp1 = arr[j];
            String[] tmp2 = tmp1.split(" ");
            // output(tmp2);
            if (tmp2[0].equals(index)) {
                String tmp3 = "";
                System.out.println("该员工原性别为：" + tmp2[3]);
                if (tmp2[3].equals("男")) {
                    tmp3 = tmp1.replace(tmp2[3], "女");
                } else if (tmp2[3].equals("女")) {
                    tmp3 = tmp1.replace(tmp2[3], "男");
                }
                arr[j] = tmp3;
                System.out.println("修改后为：");
                System.out.println(arr[j]);
                break;
            }
        }
    }

    static void changeAgeByName(String[] arr, String name, int age) {
        String sage = Integer.toString(age);
        for (int j = 0; j < arr.length; j++) {
            String tmp1 = arr[j];
            String[] tmp2 = tmp1.split(" ");
            if (tmp2[1].equals(name)) {
                String tmp3 = "";
                System.out.println("该员工原年龄为：" + tmp2[2]);
                tmp3 = tmp1.replace(tmp2[2], sage);
                arr[j] = tmp3;
                System.out.println("修改后为：");
                System.out.println(arr[j]);
                break;
            }
        }
    }

    static void searchName(String[] arr, String name) {
        for (int j = 0; j < arr.length; j++) {
            String tmp1 = arr[j];
            String[] tmp2 = tmp1.split(" ");
            if (tmp2[1].equals(name)) {
                System.out.println(arr[j]);
            }
        }
    }

    static void searchFirstName(String[] arr, String fname) {
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            String tmp1 = arr[j];
            String[] tmp2 = tmp1.split(" ");
            boolean flag = tmp2[1].startsWith(fname);
            if (flag) {
                count++;
            }
        }
        System.out.println("姓" + fname + "的员工有" + count + "人！");
    }

    static void searchAdd(String[] arr, String add) {
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            String tmp1 = arr[j];
            String[] tmp2 = tmp1.split(" ");
            if (tmp2[4].equals(add)) {
                System.out.println(arr[j]);
                count++;
            }
        }
        System.out.println("" + add + "的员工有" + count + "人！");
    }

    static void searchSex(String[] arr, String sex) {
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            String tmp1 = arr[j];
            String[] tmp2 = tmp1.split(" ");
            if (tmp2[3].equals(sex)) {
                System.out.println(arr[j]);
                count++;
            }
        }
        System.out.println(sex + "员工有" + count + "人！");
    }

    static void output(String[] arr) {
        for (String cur : arr) {
            System.out.println(cur);
        }
    }

    // static void change(String[] arr, String content) {
    // Scanner s = new Scanner(System.in);
    // System.out.print("选择你要修改的选项（1.姓名；2.年龄；3.性别；4.籍贯）：");
    // int tmp = s.nextInt();

    // }

    static void changeAddBySex(String[] arr, String sex, String add) {
        for (int j = 0; j < arr.length; j++) {
            String tmp1 = arr[j];
            String[] tmp2 = tmp1.split(" ");
            if (tmp2[3].equals(sex)) {
                // System.out.println(arr[j]);
                String tmp3 = "";

                if (!(tmp2[4].equals(add))) {
                    System.out.println("该员工原籍贯为：" + tmp2[4]);
                    tmp3 = tmp1.replace(tmp2[4], add);
                    arr[j] = tmp3;
                    System.out.print("修改后为：");
                    System.out.println(arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] person = { "1 张三 19 男 陕西", "2 私立 19 女 四川", "3 张国立 19 男 陕西", "4 张默 19 男 四川", "5 王五 19 男 四川",
                "6 王五 19 男 四川" };
        // String[] person = new String[3];
        // input(person);
        // output(person);
        // searchIndex(person, 2);
        // sexNum(person, "男");
        // searchFirstName(person, "张");
        // searchName(person, "王五");
        // searchAdd(person, "陕西");
        // changeSexByIndex(person, 2);
        // changeAgeByName(person, "张三", 20);
        changeAddBySex(person, "男", "陕西");

    }

}

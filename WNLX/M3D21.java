package WNLX;

import java.util.Scanner;

import java.util.Arrays;

public class M3D21 {
    static String inputSingle() {
        Scanner p = new Scanner(System.in);
        System.out.println("请输入员工编号(请输入数字)：");
        String tmp1 = p.nextLine();
        System.out.println("请输入员工姓名(请输入正常姓名)：");
        String tmp2 = p.nextLine();
        System.out.println("请输入员工年龄(请输入数字)：");
        String tmp3 = p.nextLine();
        System.out.println("请输入员工性别(请选择：男/女)：");
        String tmp4 = p.nextLine();
        System.out.println("请输入员工籍贯(写省市即可)：");
        String tmp5 = p.nextLine();
        String tmp = tmp1 + " " + tmp2 + " " + tmp3 + " " + tmp4 + " " + tmp5;
        // p.close();
        return tmp;
    }

    static void display(String[] arr) {
        for (String cur : arr) {
            System.out.println(cur);
        }
    }

    static void clear() {

        Scanner c = new Scanner(System.in);
        while (true) {
            System.out.println("请输入字母c来清空并结束当前选择！");
            String tmp = c.nextLine();
            if (tmp.equals("c")) {
                System.out.println("\033[H\033[2J");
                System.out.flush();
                break;
            }
        }
    }

    static int searchIndex(String[] person, int i) {
        String index = Integer.toString(i);
        // System.out.println(index);
        for (int j = 0; j < person.length; j++) {
            String tmp1 = person[j];
            String[] tmp2 = tmp1.split(" ");
            // output(tmp2);
            if (tmp2[0].equals(index)) {
                // System.out.println(person[j]);
                return j;
            }
        }
        return -1;
    }

    static String searchAdd(String[] person, String add) {
        String info = "";
        for (int j = 0; j < person.length; j++) {
            String tmp1 = person[j];
            String[] tmp2 = tmp1.split(" ");
            if (tmp2[4].equals(add)) {
                info += j;
            }
        }
        return info;
    }

    static String searchName(String[] person, String fname) {
        String linfo = "";
        if (fname.length() == 1) {
            String info = "";
            for (int j = 0; j < person.length; j++) {
                String tmp1 = person[j];
                String[] tmp2 = tmp1.split(" ");
                boolean flag = tmp2[1].startsWith(fname);
                if (flag) {
                    info += j;
                }
            }
            linfo = info;
            System.out.println();
            System.out.println("姓" + fname + "的员工有" + linfo.length() + "人！");
        } else {
            String info = "";
            for (int j = 0; j < person.length; j++) {
                String tmp1 = person[j];
                String[] tmp2 = tmp1.split(" ");
                if (tmp2[1].equals(fname)) {
                    info += j;
                }
            }
            linfo = info;
        }
        return linfo;
    }

    static String searchSex(String[] person, String sex) {
        String info = "";
        for (int j = 0; j < person.length; j++) {
            String tmp1 = person[j];
            String[] tmp2 = tmp1.split(" ");
            if (tmp2[3].equals(sex)) {
                info += j;
            }
        }
        System.out.println(sex + "员工有" + info.length() + "人！");
        return info;
    }

    static String search(String[] person, int choose) {
        String linfo = "";
        if (choose == 1) {

            while (true) {
                System.out.print("请输入要查询的员工的编号：");
                Scanner t = new Scanner(System.in);
                int i = t.nextInt();
                int ind = searchIndex(person, i);
                if (ind != -1) {
                    System.out.println(person[ind]);
                    linfo = String.valueOf(ind);
                    break;
                } else {
                    System.out.println("查无此编号，请重新输入！！！");
                }
                // clear();
            }

        } else if (choose == 2) {
            while (true) {
                System.out.print("请输入要查询的姓氏或名字：");
                Scanner f = new Scanner(System.in);
                String fname = f.nextLine();
                String info = searchName(person, fname);
                // System.out.println(info);
                if (info != "") {
                    for (int i = 0; i < info.length(); i++) {
                        char ind = info.charAt(i);
                        int p = Character.getNumericValue(ind);
                        System.out.println(person[p]);
                    }
                    linfo = info;
                    break;
                } else {
                    System.out.println("查无此人，请输入有效姓氏或名字！！！");
                }

            }

        } else if (choose == 3) {
            while (true) {
                System.out.print("请输入要查询的性别：");
                Scanner f = new Scanner(System.in);
                String sex = f.nextLine();
                String info = searchSex(person, sex);
                if (info != "") {
                    for (int i = 0; i < info.length(); i++) {
                        char ind = info.charAt(i);
                        int p = Character.getNumericValue(ind);
                        System.out.println(person[p]);
                    }
                    linfo = info;
                    break;
                } else {
                    System.out.println("请输入人类认知的性别。。。");
                }
            }

        } else if (choose == 4) {
            while (true) {
                System.out.print("请输入你要查询的地址：");
                Scanner a = new Scanner(System.in);
                String add = a.nextLine();
                String info = searchAdd(person, add);
                // System.out.println(info);
                if (info != "") {
                    for (int i = 0; i < info.length(); i++) {
                        char ind = info.charAt(i);
                        int p = Character.getNumericValue(ind);
                        System.out.println(person[p]);
                    }
                    System.out.println("" + add + "的员工有" + info.length() + "人！");
                    linfo = info;
                    break;
                } else {
                    System.out.println("请输入中国内地址！！！");
                }

            }

        }
        return linfo;
    }

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) {
        String[] person = { "1 张三 19 男 陕西", "2 李四 32 女 四川", "3 张国立 24 男 陕西", "4 张默 56 男 四川", "5 王五 15 男 四川",
                "6 陈六 29 男 四川" };
        System.out.println("欢迎使用蜗牛员工管理系统！");
        while (true) {
            // clear();
            System.out.println("请选择您需要的操作：");
            System.out.println(
                    "1、显示所有员工信息\n2、添加新员工\n3、根据编号删除员工\n4、根据性别查询员工\n5、根据编号查询员工信息\n6、根据姓或姓名查询员工\n7、根据地址查询员工信息\n8、根据名字删除员工\n9、修改年龄\n10、修改性别\n11、修改籍贯\n12、退出系统");
            Scanner s = new Scanner(System.in);
            int opt = s.nextInt();

            if (opt == 1) {
                display(person);
                clear();
            } else if (opt == 2) {
                person = Arrays.copyOf(person, person.length + 1);
                String newperson = inputSingle();
                person[person.length - 1] = newperson;
                System.out.println("员工添加成功！");
                clear();
            } else if (opt == 3) {
                while (true) {
                    System.out.print("请输入要删除的员工编号：");
                    Scanner d = new Scanner(System.in);
                    int id = d.nextInt();
                    int ind = searchIndex(person, id);
                    if (ind != -1) {
                        person[ind] = person[person.length - 1];
                        person = Arrays.copyOf(person, person.length - 1);
                        System.out.println("员工删除完成！");
                        break;
                    } else {
                        System.out.println("查无此编号，请更换编号！！！");
                    }
                }
                clear();
            } else if (opt == 4) {
                search(person, 3);
                clear();
            } else if (opt == 5) {
                // System.out.print("请输入要查询的员工的编号：");
                // Scanner t = new Scanner(System.in);
                // int i = t.nextInt();
                // int ind = searchIndex(person, i);
                // System.out.println(person[ind]);
                // clear();
                search(person, 1);
                clear();
            } else if (opt == 6) {
                search(person, 2);
                clear();
            } else if (opt == 7) {
                search(person, 4);
                clear();
            } else if (opt == 8) {
                while (true) {
                    System.out.println("请输入要删除的姓名：");
                    Scanner f = new Scanner(System.in);
                    String fname = f.nextLine();
                    String info = searchName(person, fname);
                    if (info != "") {
                        for (int i = 0; i < info.length(); i++) {
                            char ind = info.charAt(i);
                            int p = Character.getNumericValue(ind);
                            System.out.println(person[p]);
                            person[p] = person[person.length - 1];
                        }
                        person = Arrays.copyOf(person, person.length - 1);
                        System.out.println("删除成功！");
                        break;
                    } else {
                        System.out.println("查无此人，请更换姓名！！！");
                    }

                }

                clear();
            } else if (opt == 9) {
                System.out.println("请问您要依据什么查询员工：");
                System.out.println("1、编号；2、姓名；3、性别；4、籍贯");
                Scanner tmp = new Scanner(System.in);
                int ch = tmp.nextInt();
                String info = search(person, ch);

                for (int i = 0; i < info.length(); i++) {
                    char ind = info.charAt(i);
                    int p = Character.getNumericValue(ind);
                    // System.out.println(person[p]);
                    String[] tmp2 = person[p].split(" ");
                    System.out.println("该员工原年龄为：" + tmp2[2]);
                    System.out.print("修改年龄为：");
                    Scanner sage = new Scanner(System.in);
                    String age = sage.nextLine();
                    String tmp3 = person[p].replace(tmp2[2], age);
                    person[p] = tmp3;
                    System.out.println("修改后为：");
                    System.out.println(person[p]);
                }
                clear();
            } else if (opt == 10) {
                System.out.println("请问您要依据什么查询员工：");
                System.out.println("1、编号；2、姓名；3、性别；4、籍贯");
                Scanner tmp = new Scanner(System.in);
                int ch = tmp.nextInt();
                String info = search(person, ch);

                for (int i = 0; i < info.length(); i++) {
                    char ind = info.charAt(i);
                    int p = Character.getNumericValue(ind);
                    // System.out.println(person[p]);
                    String[] tmp2 = person[p].split(" ");
                    System.out.println("该员工原性别为：" + tmp2[3]);
                    System.out.print("修改性别为：");
                    Scanner sage = new Scanner(System.in);
                    String age = sage.nextLine();
                    String tmp3 = person[p].replace(tmp2[3], age);
                    person[p] = tmp3;
                    System.out.println("修改后为：");
                    System.out.println(person[p]);
                }
                clear();
            } else if (opt == 11) {
                System.out.println("请问您要依据什么查询员工：");
                System.out.println("1、编号；2、姓名；3、性别；4、籍贯");
                Scanner tmp = new Scanner(System.in);
                int ch = tmp.nextInt();
                String info = search(person, ch);

                for (int i = 0; i < info.length(); i++) {
                    char ind = info.charAt(i);
                    int p = Character.getNumericValue(ind);
                    // System.out.println(person[p]);
                    String[] tmp2 = person[p].split(" ");
                    System.out.println("该员工原籍贯为：" + tmp2[4]);
                    System.out.print("修改籍贯为：");
                    Scanner sage = new Scanner(System.in);
                    String age = sage.nextLine();
                    String tmp3 = person[p].replace(tmp2[4], age);
                    person[p] = tmp3;
                    System.out.println("修改后为：");
                    System.out.println(person[p]);
                }
                clear();
            } else if (opt == 12) {
                System.out.println("感谢使用蜗牛员工管理系统，欢迎下次使用！");
                break;
            }
        }

    }
}

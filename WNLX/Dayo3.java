package WNLX;

import java.util.Scanner;

public class Dayo3 {
    public static void Pra01() {
		Scanner s1= new Scanner(System.in);
		System.out.println("请输入分数：");
		int degree = s1.nextInt();
		if(degree>90) {
			System.out.println("A");
		}else if(degree>80) {
			System.out.println("B");
		}else if(degree>70) {
			System.out.println("C");
		}else if(degree>60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
		s1.close();
	}
}

package WNLX;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Day03 {
    static void Pra01() {
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

	static void Pra02(){
		Scanner s1 = new Scanner(System.in);
		System.out.println("请输入年份：");
		int res = s1.nextInt();
		boolean c = (res % 4==0 && res%100 != 0) || (res%400==0);
		if(c) System.out.println("是闰年。");
		else System.out.println("不是闰年。");
		s1.close();
	}

	static void Pra03(){
		Random r1=new Random();
		int tmp = r1.nextInt(100) + 1;
		System.out.println(tmp);
		int sum = 0;
		for(int i=1;i<=tmp;i++){
			sum += i;
		}
		System.out.println(sum);
	}

	static void Pra04(){
		Random r1=new Random();
		int tmp = r1.nextInt(100) + 1;
		System.out.println(tmp);
		int count = 0;
		for(int i = 1;i<=tmp;i++){
			if(i % 2 == 0){
				count++;
			}
		}
		System.out.println(count);
	}

	static void Pra05(){
		Random r1=new Random();
		int tmp = r1.nextInt(100) + 1;
		System.out.println("随机数是："+tmp);
		int sum = 0;
		for(int i = 1;i<=tmp;i++){
			if(i % 2 == 0){
				sum += i;
			}
		}
		System.out.println(sum);
	}

	static void Pra06(){
		for(int i = 1;i<=100;i++){
			if(i % 3 == 0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}

	public static void Pra07(){
		int count = 0;
		for(int i = 1;i<=100;i++){
			if(i % 3 == 0){
				count++;
			}
		}
		System.out.println(count);
	}

	static void Pra08(){
		int count = 0;
		for(int i = 1;i<=100;i++){
			if(i % 3 == 0 && i%5 != 0){
				count++;
			}
		}
		System.out.println(count);
	}

	static int Pra10(int i ){
		if(i == 1){
			return 1;
		}
		return i * Pra10(i-1);
	}

	static void Pra09() {
		BigInteger result = new BigInteger("1");//为result赋初始值，为1
		for (int i = 1; i <= 100; i++) {
			BigInteger num = new BigInteger(String.valueOf(i));
			result = result.multiply(num);//调用自乘方法
		}
		System.out.println(result);//输出结果
		System.out.println(String.valueOf(result).length());//输出长度
	}




	public static void main(String[] args){
        // Pra01();
		int tmp = Pra10(31);
		System.out.println(tmp);
    }
}





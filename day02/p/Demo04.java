package com.xms.day02.p;

import java.util.Random;
import java.util.Scanner;

/**
 * 生成一长度为4的字符串验证码，验证码中随机初选大写字母A-Z，小写字母a-z,数字0-9
 * 	 判断你所输入的验证码是否正确
 * 		1.全部转成大写字母进行比较
 * 		2.全部转成小写字母进行比较
 * 		3.不区分大小写进行比较
 * @author Administrator
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		method4();
	}
	
	
	public static void method4() {
		String str="";
		Random rd=new Random();
		for(int i=0;i<4;i++) {
			int a=rd.nextInt(3);
			switch(a) {
			case 0:
				str=str+rd.nextInt(10);
				break;
			case 1:
				str =str+(char)(rd.nextInt(26)+'a'); 
				break;
			case 2:
				str =str+(char)(rd.nextInt(26)+'A');
				break;
			}
		}
		System.out.println("str="+str);
		Scanner  sc=new Scanner(System.in);
		System.out.println("请输入验证码");
		String input=sc.nextLine();
		if(str.toUpperCase().equals(input.toUpperCase())) {
			System.out.println("验证码输入正确");
		}else {
			System.out.println("验证码输入错误");
		}
		
		if(str.toLowerCase().equals(input.toLowerCase())) {
			System.out.println("验证码输入正确");
		}else {
			System.out.println("验证码输入错误");
		}
		
		if(str.equalsIgnoreCase(input)) {
			System.out.println("验证码输入正确");
		}else {
			System.out.println("验证码输入错误");
		}
		
		if(str.equals(input)) {
			System.out.println("验证码输入正确");
		}else {
			System.out.println("验证码输入错误");
		}
	}
	

}

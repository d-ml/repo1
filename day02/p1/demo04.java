package com.xms.day02.p1;

import java.util.Random;
import java.util.Scanner;

/**
 * ����һ����Ϊ4���ַ�����֤�룬��֤���������ѡ��д��ĸA-Z��Сд��ĸa-z,����0-9
 * 	 �ж������������֤���Ƿ���ȷ
 * 		1.ȫ��ת�ɴ�д��ĸ���бȽ�
 * 		2.ȫ��ת��Сд��ĸ���бȽ�
 * 		3.�����ִ�Сд���бȽ�
 * @author Administrator
 *
 *//**
 * ����һ����Ϊ4���ַ�����֤�룬��֤���������ѡ��д��ĸA-Z��Сд��ĸa-z,����0-9
 * 	 �ж������������֤���Ƿ���ȷ
 * 		1.ȫ��ת�ɴ�д��ĸ���бȽ�
 * 		2.ȫ��ת��Сд��ĸ���бȽ�
 * 		3.�����ִ�Сд���бȽ�
 * @author Administrator
 *
 */
public class demo04 {
	public  static void method1() {
		String str="";
		Random rd=new Random();
		for(int i=0;i<4;i++) {
			int a=rd.nextInt(3);
			switch(a) {
			case 0:
				str=str+rd.nextInt(10);
				break;
			case 1:
				str=str+(char)(rd.nextInt(26)+'A');
				break;
			case 2:
				str=str+(char)(rd.nextInt(26)+'a');
				break;
			}
		}
		System.out.println(str);
		Scanner sc=new Scanner(System.in);
		System.out.println("������");
		String inputStr=sc.nextLine();
		if(str.toUpperCase().equals(inputStr.toUpperCase())) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		if(str.equalsIgnoreCase(inputStr)) {
			System.out.println("yes");
			
		}
		
		
		
	}
	public static void main(String[] args) {
		method1();
	}
	
	
}



















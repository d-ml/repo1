package com.xms.day02.p;

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
		System.out.println("��������֤��");
		String input=sc.nextLine();
		if(str.toUpperCase().equals(input.toUpperCase())) {
			System.out.println("��֤��������ȷ");
		}else {
			System.out.println("��֤���������");
		}
		
		if(str.toLowerCase().equals(input.toLowerCase())) {
			System.out.println("��֤��������ȷ");
		}else {
			System.out.println("��֤���������");
		}
		
		if(str.equalsIgnoreCase(input)) {
			System.out.println("��֤��������ȷ");
		}else {
			System.out.println("��֤���������");
		}
		
		if(str.equals(input)) {
			System.out.println("��֤��������ȷ");
		}else {
			System.out.println("��֤���������");
		}
	}
	

}

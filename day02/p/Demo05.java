package com.xms.day02.p;
/**
 *  5.ͳ���ַ�����ilovechinailovechinailovechinailovechinailovechinailovechina��
 * ��china���ֵĴ�����
 * @author Administrator
 */
public class Demo05 {
	public static void main(String[] args) {
		method();
	}
	
	public static void method() {
		String str="ilovechinailovechinailovechinailovechinailovechinailovechina";
		int count=0;
		String min="china";
		while(str.indexOf(min)!=-1) {
			str=str.substring(str.indexOf(min)+min.length());
			System.out.println(str);
			count++;
		}
		System.out.println("china������"+count+"��");
	}

}

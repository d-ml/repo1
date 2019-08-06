package com.xms.day02.p;
/**
 *  5.统计字符串“ilovechinailovechinailovechinailovechinailovechinailovechina”
 * 中china出现的次数？
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
		System.out.println("china出现了"+count+"次");
	}

}

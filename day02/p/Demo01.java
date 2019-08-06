package com.xms.day02.p;
/**
 * 1.½«×Ö·û´®¡°jdk¡±--->"DK
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		method();
	}
	
	public static void  method() {
		String small="jdk";
		String  s0=small.toUpperCase();
		String  s1=s0.substring(s0.indexOf("D"));
		System.out.println("s1="+s1);
	}
}

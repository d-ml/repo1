package com.xms.day02.p;
//2.½«×Ö·û´®¡°object¡±----->"tcejbo"
public class Demo02 {
	public static void  main(String[] args) {
		method();
	}
	public static void method() {
		String str="ojbect";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
}

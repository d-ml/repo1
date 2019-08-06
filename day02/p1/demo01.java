package com.xms.day02.p1;
//jdk---DK
public class demo01 {
	public static void main(String[] args) {
		String str="jdk";
		String big=str.toUpperCase();
		String substr=big.substring(big.indexOf("D"));
		System.out.println(substr);
	}
}

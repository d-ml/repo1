package com.xms.day02;

import java.util.Arrays;

/**
 * 正则表达式，本身不属于java，借鉴而来-----有部分不兼容
 * 理解为规则-----限定字符串的格式规则
 * 一般用于字符串的验证
 * matches(String regex):判断当前字符串是否满足指定的格式要求
 * -----全匹配
 * -----返回值为boolean类型
 * 			格式匹配为true,
 * 			格式不匹配为false
 * @author Administrator
 * 正则表达式三个方法
 * matches方法
 * split()
 * replaceAll()
 * 
 */
public class Demo03StringZz {
	public static  void method1() {
		//正则表达式
//		String  regex="[a-z&&[^bc]]";	//任意一个
		String regex="\\d";//转义字符
		System.out.println(regex);
		//输入的数据
		String input="b";
		boolean bo1=input.matches(regex);
		System.out.println(bo1);
	}
	
	public static void method2() {
		//电话号码
		//1开头  10位数字
		String regex1="[1]\\d{10}";
		String input1="18856431794";
		System.out.println(input1.matches(regex1));
		//身份证号码18
		
	
		
		
		
	}
	
	
	public static void method3() {
		/*
		 * split(String regex)
		 * 按照指定正则表达式分割字符串
		 * 返回值为分割后的字符串数组
		 * 
		 */
		String str="java#php#c++#python#.net";
		//以#分割
		String[] strArr=str.split("#");
		System.out.println(Arrays.toString(strArr));
		//以数字分割
		String str1="java123php34c++55python77.net";
		String[] str1Arr=str1.split("\\d+");
		System.out.println(Arrays.toString(str1Arr));
	}
	
	public static void method4() {
		/*
		 * replaceAll(String regex,String str)
		 * 
		 * 以正则表达式将当前字符串对象中所有的regex替换成
		 * str，返回值为替换后的字符串读对象
		 */
		String str="sagdfuky122kj3hhj43j3kjj";
		//将该字符串中所有数字替换成——————>？
		String regex="\\d+";
		String s=str.replaceAll(regex, "?");
		System.out.println(s);//sagdfuky?kj?hhj?j?kjj
		
	}
	
	public static void method5() {
		/*
		 * 边界匹配：
		 	^ 代表字符串开始
		 	$ 代表字符串结束
		例如：匹配用户名规则
		 	从头到尾连续8~10个单词字符；
			\w{8,10}
		   ^\w{8,10}$
		 * java中的正则表达式默认有边界符
		 * 
		 */
		String s="\\w(8,10)";
		String str="abcd1234_abcd";
		System.out.println(str.matches(s));
	}
	
	
	public static void main(String[] args) {
//		method1();
//		method2();
//		method3();
//		method4();
		method5();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

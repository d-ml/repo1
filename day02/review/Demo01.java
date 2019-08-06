package com.xms.day02.review;
/**
 * String str=""<===>Strinr str=new String()
;l; * @author Administrator
 *
 */
public class Demo01 {
	public static void method1() {
		//使用new关键字创建对象
		String str=new String();
		//字面量创建对象
		String str1="123";
		
		//将字节数组转换成字符数组
		//public String(byte[] byte)
		byte[] arr=new byte[] {98,99,100};//将int类型的整数转换成char类型的
		String str2=new String(arr);
		System.out.println(arr); //bcd
		
		//将字节数组的一部分转换为字符数组
		//public String(byte[] byte,int index,int length)
		String str3=new String(arr,1,2);
		System.out.println(str3);//bc
		
		//将字符数组转换成字符串
		//public String(char[] c)
		char[] arr1=new char[] {'a','b','c'};
		String str4=new String(arr1);
		System.out.println(str4);//abc
		
		//将字符数组的一部分转换成字符串
		//public String(char[] c，int index,int length )
		String str5=new  String(arr1,0,3);//abc
		System.out.println(str5);
	}
	
	public static void method2() {
		/**
		 * ==与equals 的区别
		 * 
		 * ==：
		 * 	基本类型 比较的是具体值
		 * 	引用类型比较的是地址值
		 * equals():一般比较引用类型
		 * 
		 */
		String s0="abc";
		String s1="abc";
		String s2=new String("abc");
		String s3=new String("abc");
		System.out.println();
		System.out.println(s0==s1);//true		
		System.out.println(s0==s2);//false
		System.out.println(s2==s3);//false 
		System.out.println("---------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}

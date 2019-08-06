package com.xms.day02;

import java.util.Scanner;

/**
 * String  类型的方法介绍
 * @author Administrator
 *字符串对象.方法名
 */
public class Demo01String {
	public static void method1() {
		String  str="good good study,day day up";
		/*
		 *indexOf(String str ,int index) 
		 *从下标为index(包括)的位置开始检索指定的字符串str
		 *返回值为对应的字符串下标位置（整数类型）
		 *
		 * 方法与方法之间是可以嵌套使用的
		 */
		int len=str.indexOf("good");
		System.out.println("len="+len);
		
//		int len1=str.indexOf("good",1);//检索第二次出现的good
		int len1=str.indexOf("good",len+1);
		System.out.println("len1="+len1);
		
		/*
		 * lastIndexOf(String str)
		 * 检索指定字符串最后一次出现的位置
		 * 返回值类型为整数类型的数
		 * www.baidu.com
		 */
		int len2=str.lastIndexOf("good");
		System.out.println("len2="+len2);//最后一次出现good的位置
	}
//---------------------------------------------------
	public static void method2() {
		/**
		 * java.lang.StringIndexOutOfBoundsException
		 * 字符串下标越界
		 * 在使用字符串方法时，注意参数不要超过指定字符串兑现的下标范围
		 */
		/*
		 * subString(int start,int end)----两刀取中间
		 * 截取指定下标区域的字符串----[start,end)前包括后不包括
		 * 返回值为截取到的字符串
		 */
		String str="0123456789";
		String s=str.substring(2,5);
		System.out.println("s="+s);
		
		/**
		 * 经常用来截取域名
		 * www.baidu.com
		 * 截取--baidu--
		 */
		String baidu="www.baidu.com";
		String s0=baidu.substring(baidu.indexOf(".")+1,baidu.lastIndexOf("."));
		System.out.println("s0="+s0);
		
		/*
		 * subString(int index)----一刀取结尾
		 * 截取index下标之后的字符串，包括index
		 * 返回值为对应截取的字符
		 */
		String s1=str.substring(6);
		System.out.println("s1="+s1);
	}
//---------------------------------------------	
	public static void method3() {
		/**
		 * trim():
		 * 去除当前字符串对象的两端空白
		 * ---不能去除中间的空白（空格键、enter、tab）
		 * --返回值为去除空白后的字符串对象
		 */
		String str=" 坏蛋是 怎样炼成的 ";
		String s0=str.trim();
		System.out.println("str="+str);
		System.out.println("s0="+s0);
	}
//--------------------------------------------	
	public static void method4() {
		/**
		 * charAt（int index）
		 * 查看指定下标的字符
		 * 返回值为该下标的字符 ---char类型
		 * 
		 * 
		 */
		String str="hello";
		char c=str.charAt(1);
		System.out.println("c="+c);
		
	}
//---------------------------------------------
	public static void  method5() {
		/*
		 * statsWith(String str)：判断是否以指定字符串开头 
		 * endsWith(String  str)：判断是否以指定字符串开头
		 * 判断当前对象 是否是以指定字符串 开头/结尾
		 * 返回值类型为boolean类型 
		 * 
		 * 如果以指定字符串开头/结尾返回值 为true
		 * 否则返回值为false
		 */
		//上传一个以.png结尾的图片
		Scanner sc=new Scanner(System.in);
		System.out.println("请上传一个以.png结尾的图片");
		String str=sc.nextLine();
		if(str.endsWith(".png")) {
			System.out.println("格式正确，上传成功");
		}else {
			System.out.println("格式不正确,上传失败");
		}
	}
//--------------------------------------------------------
	public static void method6() {
		/**
		 * toUpperCase():将字符串字母改成大写---只针对字母
		 * toLowerCase()：将字符串字母改成小写---只针对字母
		 * 返回值为对应的改变后的字符串对象
		 */
		String small="abc";
		String big="ABC";
		//将字符串small变成大写字母
		String s0=small.toUpperCase();
		System.out.println("s0="+s0);
		//将字符串big变成小写字母
		String s1=big.toLowerCase();
		System.out.println("s1="+s1);
		/*
		 * equalsIgnoreCase(String str)
		 * 将两个字符串不分大小写比较
		 * 
		 * 如果字母相同则返回值为true
		 * 如果字母不同则返回值为false
		 */
		boolean bo1=small.equals(big);
		System.out.println("bo1="+bo1);
		boolean bo2=small.equalsIgnoreCase(big);
		System.out.println("bo2="+bo2);
	}
//------------------------------------------	
	public static  void method7() {
		/*
		 * 将基类型数据 转字符串类型 数据
		 * string.valueOf(基本类型 o)
		 * 将基本类型的数据转成String类型
		 * 返回值为String类型
		 */
		int i=23;
		System.out.println(i+2);
		String str=String.valueOf(i);
		System.out.println(str+2);//232
		String  str1=String.valueOf(25.5);
		System.out.println(str1+2);//25.52
		
		/*
		 * 数字字符串转换成能够进行四则运算的基本数据类型------只能转换数字
		 * 基本数据类型包装类.parse基本类型（）
		 * 返回值为对应的基本数据类型
		 * 
		 * java.lang.NumberFormatException
		 * 数字转换异常
		 * 注意字符串得是数字
		 * 
		 */
		String str2="12.5";
		double doub1=Double.parseDouble(str2);
		System.out.println(doub1+1);//12.5+1
		
		String str3="12";
		int in=Integer.parseInt(str3);
		System.out.println(in+2);//12+2
		
		String str4="12";
		float flo=Float.parseFloat(str4);
		System.out.println(flo+1.1);//13.1
		
		
		
		
		
		
	}
	
//--------------------------------------------------------
	public static void main(String[] args) {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
		method7();
	}
}


/*练习
 * 1.将字符串“jdk”--->"DK’
 * 2.将字符串“object”----->"tcejbo"
 * 3.计算字符串“asssFHjdhbn123445”中有几个数字、几个字母？几个大写字母？几个小写字母
 * 4.生成一长度为4的字符串验证码，验证码中随机初选大写字母A-Z，小写字母a-z,数字0-9
 * 	 判断你所输入的验证码是否正确
 * 		1.全部转成大写字母进行比较
 * 		2.全部转成小写字母进行比较
 * 		3.不区分大小写进行比较
 * 5.统计字符串“ilovachinailovachinailovachinailovachinailovachinailovachina”
 * 中china出现的次数？
 * 
 * 6.
	 判断某个字符串对象是否是回文
	上海自来水来自海上（charArt length写）
		 
 * 
 * 
 */






























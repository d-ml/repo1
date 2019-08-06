package com.xms.day02;
/**
 * 可变字符序列：可以对字符串进行修改
 * StringBuilder:线程（thread）非安全，并发处理，性能较快
 * StringBuffer :线程安全，同步处理，性能较慢
 * 用法和类中封装的方法一致
 * -----字符串的追加（append）、修改、删除(delet)、替换(replace)、插入(insert)、反转(reverse)
 * -----对应的方法返回值为当前类型的当前对象
 * @author Administrator
 *
 */
public class Demo02StringBuilder {
	public static void method1() {
		//创建一个可以动态拓展字符串的可变字符序列对象
		StringBuilder sb=new StringBuilder();
//		StringBuffer  sbf=new StringBuffer();
//		StringBuilder sb1=new StringBuilder("abc");
		/*
		 * 追加
		 * append(String str)
		 * 追加指定字符串到当前可变字符序列对象 中
		 * 返回值为当前类型的当前对象
		 * 
		 */
		StringBuilder sb01=sb.append("hello");
		System.out.println(sb01);//hello
		StringBuilder sb02=sb01.append("world");
		System.out.println(sb02);//helloworld
		
		/*
		 * delete(int  start,int end)
		 * 删除指定区域的字符串[start,end)前包括后不包括
		 * 返回值也是为当前类型的当前对象
		 * 
		 */
		//helloworld--->hellowor
		StringBuilder sb03=sb02.delete(8, 10);
		System.out.println(sb03);//hellowor
		
		
		/*
		 * replace(int start,int  end,String str)
		 * 将指定区域的字符串替换成str
		 * 返回值为当前类型的当前对象
		 */
		//hellowor--->javawor
		StringBuilder sb04=sb03.replace(0, 5, "java");
		System.out.println(sb04);//javawor
		
		/*
		 * insert(int index,String str)
		 * 在指定位置（index）插入指定字符串str
		 * 返回值为当前类型的当前对象
		 * 
		 * 在指定位置插入对应的字符串时，当前位置
		 * 以及之后的字符都会依次向后移动
		 */
		//javawor--->java##wor
		StringBuilder sb05=sb04.insert(4, "##");
		System.out.println(sb05);//java##wor
		
		/*
		 * reverse();
		 * 将字符串反转
		 * 返回值为当前类型的当前对象
		 */
		//java##wor--->row##avaj
		StringBuilder sb06=sb05.reverse();
		System.out.println(sb06);//row##avaj
		
		/**
		 * 返回值为当前类型的当前对象的好处：
		 * 因为字符串需要重复修改使用创建多个变量名的方式比较繁琐，
		 * 在封装这些方法的时返回值为this，
		 * 可以在当前对象上进行多次修改，使用比较快捷方便
		 */
		
		
		
	}
	public static void main(String[] args) {
		method1();
	}

}

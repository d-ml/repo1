package com.xms.day02.review;
/**
 * String str=""<===>Strinr str=new String()
;l; * @author Administrator
 *
 */
public class Demo01 {
	public static void method1() {
		//ʹ��new�ؼ��ִ�������
		String str=new String();
		//��������������
		String str1="123";
		
		//���ֽ�����ת�����ַ�����
		//public String(byte[] byte)
		byte[] arr=new byte[] {98,99,100};//��int���͵�����ת����char���͵�
		String str2=new String(arr);
		System.out.println(arr); //bcd
		
		//���ֽ������һ����ת��Ϊ�ַ�����
		//public String(byte[] byte,int index,int length)
		String str3=new String(arr,1,2);
		System.out.println(str3);//bc
		
		//���ַ�����ת�����ַ���
		//public String(char[] c)
		char[] arr1=new char[] {'a','b','c'};
		String str4=new String(arr1);
		System.out.println(str4);//abc
		
		//���ַ������һ����ת�����ַ���
		//public String(char[] c��int index,int length )
		String str5=new  String(arr1,0,3);//abc
		System.out.println(str5);
	}
	
	public static void method2() {
		/**
		 * ==��equals ������
		 * 
		 * ==��
		 * 	�������� �Ƚϵ��Ǿ���ֵ
		 * 	�������ͱȽϵ��ǵ�ֵַ
		 * equals():һ��Ƚ���������
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

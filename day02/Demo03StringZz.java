package com.xms.day02;

import java.util.Arrays;

/**
 * ������ʽ����������java���������-----�в��ֲ�����
 * ���Ϊ����-----�޶��ַ����ĸ�ʽ����
 * һ�������ַ�������֤
 * matches(String regex):�жϵ�ǰ�ַ����Ƿ�����ָ���ĸ�ʽҪ��
 * -----ȫƥ��
 * -----����ֵΪboolean����
 * 			��ʽƥ��Ϊtrue,
 * 			��ʽ��ƥ��Ϊfalse
 * @author Administrator
 * ������ʽ��������
 * matches����
 * split()
 * replaceAll()
 * 
 */
public class Demo03StringZz {
	public static  void method1() {
		//������ʽ
//		String  regex="[a-z&&[^bc]]";	//����һ��
		String regex="\\d";//ת���ַ�
		System.out.println(regex);
		//���������
		String input="b";
		boolean bo1=input.matches(regex);
		System.out.println(bo1);
	}
	
	public static void method2() {
		//�绰����
		//1��ͷ  10λ����
		String regex1="[1]\\d{10}";
		String input1="18856431794";
		System.out.println(input1.matches(regex1));
		//���֤����18
		
	
		
		
		
	}
	
	
	public static void method3() {
		/*
		 * split(String regex)
		 * ����ָ��������ʽ�ָ��ַ���
		 * ����ֵΪ�ָ����ַ�������
		 * 
		 */
		String str="java#php#c++#python#.net";
		//��#�ָ�
		String[] strArr=str.split("#");
		System.out.println(Arrays.toString(strArr));
		//�����ַָ�
		String str1="java123php34c++55python77.net";
		String[] str1Arr=str1.split("\\d+");
		System.out.println(Arrays.toString(str1Arr));
	}
	
	public static void method4() {
		/*
		 * replaceAll(String regex,String str)
		 * 
		 * ��������ʽ����ǰ�ַ������������е�regex�滻��
		 * str������ֵΪ�滻����ַ���������
		 */
		String str="sagdfuky122kj3hhj43j3kjj";
		//�����ַ��������������滻�ɡ�����������>��
		String regex="\\d+";
		String s=str.replaceAll(regex, "?");
		System.out.println(s);//sagdfuky?kj?hhj?j?kjj
		
	}
	
	public static void method5() {
		/*
		 * �߽�ƥ�䣺
		 	^ �����ַ�����ʼ
		 	$ �����ַ�������
		���磺ƥ���û�������
		 	��ͷ��β����8~10�������ַ���
			\w{8,10}
		   ^\w{8,10}$
		 * java�е�������ʽĬ���б߽��
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

package com.xms.day02;

import java.util.Scanner;

/**
 * String  ���͵ķ�������
 * @author Administrator
 *�ַ�������.������
 */
public class Demo01String {
	public static void method1() {
		String  str="good good study,day day up";
		/*
		 *indexOf(String str ,int index) 
		 *���±�Ϊindex(����)��λ�ÿ�ʼ����ָ�����ַ���str
		 *����ֵΪ��Ӧ���ַ����±�λ�ã��������ͣ�
		 *
		 * �����뷽��֮���ǿ���Ƕ��ʹ�õ�
		 */
		int len=str.indexOf("good");
		System.out.println("len="+len);
		
//		int len1=str.indexOf("good",1);//�����ڶ��γ��ֵ�good
		int len1=str.indexOf("good",len+1);
		System.out.println("len1="+len1);
		
		/*
		 * lastIndexOf(String str)
		 * ����ָ���ַ������һ�γ��ֵ�λ��
		 * ����ֵ����Ϊ�������͵���
		 * www.baidu.com
		 */
		int len2=str.lastIndexOf("good");
		System.out.println("len2="+len2);//���һ�γ���good��λ��
	}
//---------------------------------------------------
	public static void method2() {
		/**
		 * java.lang.StringIndexOutOfBoundsException
		 * �ַ����±�Խ��
		 * ��ʹ���ַ�������ʱ��ע�������Ҫ����ָ���ַ������ֵ��±귶Χ
		 */
		/*
		 * subString(int start,int end)----����ȡ�м�
		 * ��ȡָ���±�������ַ���----[start,end)ǰ�����󲻰���
		 * ����ֵΪ��ȡ�����ַ���
		 */
		String str="0123456789";
		String s=str.substring(2,5);
		System.out.println("s="+s);
		
		/**
		 * ����������ȡ����
		 * www.baidu.com
		 * ��ȡ--baidu--
		 */
		String baidu="www.baidu.com";
		String s0=baidu.substring(baidu.indexOf(".")+1,baidu.lastIndexOf("."));
		System.out.println("s0="+s0);
		
		/*
		 * subString(int index)----һ��ȡ��β
		 * ��ȡindex�±�֮����ַ���������index
		 * ����ֵΪ��Ӧ��ȡ���ַ�
		 */
		String s1=str.substring(6);
		System.out.println("s1="+s1);
	}
//---------------------------------------------	
	public static void method3() {
		/**
		 * trim():
		 * ȥ����ǰ�ַ�����������˿հ�
		 * ---����ȥ���м�Ŀհף��ո����enter��tab��
		 * --����ֵΪȥ���հ׺���ַ�������
		 */
		String str=" ������ �������ɵ� ";
		String s0=str.trim();
		System.out.println("str="+str);
		System.out.println("s0="+s0);
	}
//--------------------------------------------	
	public static void method4() {
		/**
		 * charAt��int index��
		 * �鿴ָ���±���ַ�
		 * ����ֵΪ���±���ַ� ---char����
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
		 * statsWith(String str)���ж��Ƿ���ָ���ַ�����ͷ 
		 * endsWith(String  str)���ж��Ƿ���ָ���ַ�����ͷ
		 * �жϵ�ǰ���� �Ƿ�����ָ���ַ��� ��ͷ/��β
		 * ����ֵ����Ϊboolean���� 
		 * 
		 * �����ָ���ַ�����ͷ/��β����ֵ Ϊtrue
		 * ���򷵻�ֵΪfalse
		 */
		//�ϴ�һ����.png��β��ͼƬ
		Scanner sc=new Scanner(System.in);
		System.out.println("���ϴ�һ����.png��β��ͼƬ");
		String str=sc.nextLine();
		if(str.endsWith(".png")) {
			System.out.println("��ʽ��ȷ���ϴ��ɹ�");
		}else {
			System.out.println("��ʽ����ȷ,�ϴ�ʧ��");
		}
	}
//--------------------------------------------------------
	public static void method6() {
		/**
		 * toUpperCase():���ַ�����ĸ�ĳɴ�д---ֻ�����ĸ
		 * toLowerCase()�����ַ�����ĸ�ĳ�Сд---ֻ�����ĸ
		 * ����ֵΪ��Ӧ�ĸı����ַ�������
		 */
		String small="abc";
		String big="ABC";
		//���ַ���small��ɴ�д��ĸ
		String s0=small.toUpperCase();
		System.out.println("s0="+s0);
		//���ַ���big���Сд��ĸ
		String s1=big.toLowerCase();
		System.out.println("s1="+s1);
		/*
		 * equalsIgnoreCase(String str)
		 * �������ַ������ִ�Сд�Ƚ�
		 * 
		 * �����ĸ��ͬ�򷵻�ֵΪtrue
		 * �����ĸ��ͬ�򷵻�ֵΪfalse
		 */
		boolean bo1=small.equals(big);
		System.out.println("bo1="+bo1);
		boolean bo2=small.equalsIgnoreCase(big);
		System.out.println("bo2="+bo2);
	}
//------------------------------------------	
	public static  void method7() {
		/*
		 * ������������ ת�ַ������� ����
		 * string.valueOf(�������� o)
		 * ���������͵�����ת��String����
		 * ����ֵΪString����
		 */
		int i=23;
		System.out.println(i+2);
		String str=String.valueOf(i);
		System.out.println(str+2);//232
		String  str1=String.valueOf(25.5);
		System.out.println(str1+2);//25.52
		
		/*
		 * �����ַ���ת�����ܹ�������������Ļ�����������------ֻ��ת������
		 * �����������Ͱ�װ��.parse�������ͣ���
		 * ����ֵΪ��Ӧ�Ļ�����������
		 * 
		 * java.lang.NumberFormatException
		 * ����ת���쳣
		 * ע���ַ�����������
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


/*��ϰ
 * 1.���ַ�����jdk��--->"DK��
 * 2.���ַ�����object��----->"tcejbo"
 * 3.�����ַ�����asssFHjdhbn123445�����м������֡�������ĸ��������д��ĸ������Сд��ĸ
 * 4.����һ����Ϊ4���ַ�����֤�룬��֤���������ѡ��д��ĸA-Z��Сд��ĸa-z,����0-9
 * 	 �ж������������֤���Ƿ���ȷ
 * 		1.ȫ��ת�ɴ�д��ĸ���бȽ�
 * 		2.ȫ��ת��Сд��ĸ���бȽ�
 * 		3.�����ִ�Сд���бȽ�
 * 5.ͳ���ַ�����ilovachinailovachinailovachinailovachinailovachinailovachina��
 * ��china���ֵĴ�����
 * 
 * 6.
	 �ж�ĳ���ַ��������Ƿ��ǻ���
	�Ϻ�����ˮ���Ժ��ϣ�charArt lengthд��
		 
 * 
 * 
 */






























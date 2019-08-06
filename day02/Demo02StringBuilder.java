package com.xms.day02;
/**
 * �ɱ��ַ����У����Զ��ַ��������޸�
 * StringBuilder:�̣߳�thread���ǰ�ȫ�������������ܽϿ�
 * StringBuffer :�̰߳�ȫ��ͬ���������ܽ���
 * �÷������з�װ�ķ���һ��
 * -----�ַ�����׷�ӣ�append�����޸ġ�ɾ��(delet)���滻(replace)������(insert)����ת(reverse)
 * -----��Ӧ�ķ�������ֵΪ��ǰ���͵ĵ�ǰ����
 * @author Administrator
 *
 */
public class Demo02StringBuilder {
	public static void method1() {
		//����һ�����Զ�̬��չ�ַ����Ŀɱ��ַ����ж���
		StringBuilder sb=new StringBuilder();
//		StringBuffer  sbf=new StringBuffer();
//		StringBuilder sb1=new StringBuilder("abc");
		/*
		 * ׷��
		 * append(String str)
		 * ׷��ָ���ַ�������ǰ�ɱ��ַ����ж��� ��
		 * ����ֵΪ��ǰ���͵ĵ�ǰ����
		 * 
		 */
		StringBuilder sb01=sb.append("hello");
		System.out.println(sb01);//hello
		StringBuilder sb02=sb01.append("world");
		System.out.println(sb02);//helloworld
		
		/*
		 * delete(int  start,int end)
		 * ɾ��ָ��������ַ���[start,end)ǰ�����󲻰���
		 * ����ֵҲ��Ϊ��ǰ���͵ĵ�ǰ����
		 * 
		 */
		//helloworld--->hellowor
		StringBuilder sb03=sb02.delete(8, 10);
		System.out.println(sb03);//hellowor
		
		
		/*
		 * replace(int start,int  end,String str)
		 * ��ָ��������ַ����滻��str
		 * ����ֵΪ��ǰ���͵ĵ�ǰ����
		 */
		//hellowor--->javawor
		StringBuilder sb04=sb03.replace(0, 5, "java");
		System.out.println(sb04);//javawor
		
		/*
		 * insert(int index,String str)
		 * ��ָ��λ�ã�index������ָ���ַ���str
		 * ����ֵΪ��ǰ���͵ĵ�ǰ����
		 * 
		 * ��ָ��λ�ò����Ӧ���ַ���ʱ����ǰλ��
		 * �Լ�֮����ַ�������������ƶ�
		 */
		//javawor--->java##wor
		StringBuilder sb05=sb04.insert(4, "##");
		System.out.println(sb05);//java##wor
		
		/*
		 * reverse();
		 * ���ַ�����ת
		 * ����ֵΪ��ǰ���͵ĵ�ǰ����
		 */
		//java##wor--->row##avaj
		StringBuilder sb06=sb05.reverse();
		System.out.println(sb06);//row##avaj
		
		/**
		 * ����ֵΪ��ǰ���͵ĵ�ǰ����ĺô���
		 * ��Ϊ�ַ�����Ҫ�ظ��޸�ʹ�ô�������������ķ�ʽ�ȽϷ�����
		 * �ڷ�װ��Щ������ʱ����ֵΪthis��
		 * �����ڵ�ǰ�����Ͻ��ж���޸ģ�ʹ�ñȽϿ�ݷ���
		 */
		
		
		
	}
	public static void main(String[] args) {
		method1();
	}

}

package com.xms.day02.p;
/**
 * �Ϻ�����ˮ���Ժ���
 * @author Administrator
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		String str="��Լ������ƶ���";//�ƽ������󻬻ƽ�
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				System.out.println("���ǻ��ģ�");
				return;
			}
		}
		System.out.println("�ǻ���");
		
//------------------------------------------------------------------
		boolean  flag=false;
		for(int  i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("���ǻ���");
		}else {
			System.out.println("�ǻ���");
		}
	}
}
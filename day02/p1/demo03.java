package com.xms.day02.p1;
/*3.�����ַ�����asssFHjdhbn123445�����м������֡�
 * ������ĸ��������д��ĸ������Сд��ĸ
 */
public class demo03 {
	public static void main(String[] args) {
		String str="asssFHjdhbn123445";
		int num=0;
		int big=0;
		int small=0;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c>='0'&&c<='9') {
				num++;
			}else if(c>='a'&&c<='z') {
				small++;
			}else if(c>='A'&&c<='Z') {
				big++;
			}
		}
		System.out.println("num="+num);
		System.out.println("big="+big);
		System.out.println("small="+small);
		
		
	}

}

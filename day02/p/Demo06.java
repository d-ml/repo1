package com.xms.day02.p;
/**
 * 上海自来水来自海上
 * @author Administrator
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		String str="面对计算机算计对面";//黄金润滑油润滑黄金
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				System.out.println("不是回文！");
				return;
			}
		}
		System.out.println("是回文");
		
//------------------------------------------------------------------
		boolean  flag=false;
		for(int  i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("不是回文");
		}else {
			System.out.println("是回文");
		}
	}
}
package com.seleniumSessions;

public class ReversingNum {

	public static void main(String[] args) {
		int num=1230;
		/*int rev=0;
		int rem=0;
		while(num>0) 
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reveresed number:"+rev);*/
		
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		sb=sb.reverse();
		System.out.println("reversed string:"+sb);
		String str=sb.toString();
		int i=Integer.parseInt(str);
		System.out.println("*********************");
		System.out.println("Reversed number:"+i);
	}

}

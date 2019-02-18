package com.seleniumSessions;

public class ReverseAWord {

	public static void main(String[] args) {
		//palindrome
		char[] ch=new char[]{'m','d','d','a','m'};
		int count=0;
		for (char i = 0; i <=(ch.length/2)+1; i++) 
		{
			if(ch[i]!=ch[ch.length-1-i])
			{
				count++;
				break;
			}
		}
		if (count>0) 
			System.out.println("Not pallindrome");
		else
			System.out.println("pallindrome");
			
		
		
	}

}

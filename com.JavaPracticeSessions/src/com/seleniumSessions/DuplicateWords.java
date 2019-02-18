package com.seleniumSessions;

public class DuplicateWords {

	public static void main(String[] args) {
		String str1="java selenium java api";
		String[] str2=str1.split(" ");
		
		for (int i = 0; i <=str2.length-1; i++) 
		{
			int count1=0;
			for (int k = 0; k <=i-1; k++) 
			{
			if(str2[i].equals(str2[k]))
			count1++;	
			}
			if(count1==0)
			{
				int count2=1;
				for (int j = i+1; j < str2.length; j++) 
				{
					if (str2[i].equals(str2[j]))
						count2++;
				}
				if(count2>1)
					System.out.println("Duplicate Element is:"+str2[i]);
			}
		}

	}

}

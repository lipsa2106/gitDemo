package com.seleniumSessions;

public class RetryImpl {

	public static void main(String[] args) {
		RetryImpl a=new RetryImpl();
		a.retryMtd();
		System.out.println("completed");
		
	}
	public boolean retryMtd()
	{
		int counter=3;
		int retryLimit=3;
		if(counter<retryLimit)
		{
			counter++;
			return true;
		}
		return false;
	}

}

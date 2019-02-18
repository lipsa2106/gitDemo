package com.seleniumSessions;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String> hm=new HashMap<>();
		hm.put(1, "a");
		hm.put(2, "b");
		hm.put(3, "c");
		hm.put(4, "d");
		for (Map.Entry<Integer, String> m : hm.entrySet())
		{
		System.out.println(m.getKey()+"---------->"+m.getValue());	
		}

	}

}

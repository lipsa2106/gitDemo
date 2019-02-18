package com.JavaPracticeSessions;

public class Person {
	
	private int id;
	private String name;
	private String Loc;
	
	public Person(int id, String name, String loc) {
		
		this.id = id;
		this.name = name;
		this.Loc = loc;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLoc() {
		return Loc;
	}
	

}

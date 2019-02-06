package com.JavaPracticeSessions;

import java.io.File;

public class CheckFileExistance {

	public static void main(String[] args) {
		File f= new File("C:\\Users\\lisahoo\\Desktop\\course.csv");
		if(f.exists())
			System.out.println("File exists");
		else
			System.out.println("File doesn't exists");

	}

}

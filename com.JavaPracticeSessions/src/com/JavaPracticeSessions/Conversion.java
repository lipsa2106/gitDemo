package com.JavaPracticeSessions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Conversion {

	public static void main(String[] args) throws Throwable, JsonMappingException, IOException {
		/*Employee2 e1= new Employee2();
		e1.setEmpid(345);
		e1.setEmpLoc("Delhi");
		e1.setEmpName("Sachin");
		
		ObjectMapper m= new ObjectMapper();
		String s=m.writeValueAsString(e1);//pretty print on console
		System.out.println(s);
		
		File f1=new File("./abc.json");//convert and store in file
		m.writeValue(f1, e1);*/
		
		/*FileReader f= new FileReader("./abc.json");
		ObjectMapper m=new ObjectMapper();
		
		Employee2 e=m.readValue(f, Employee2.class);
		System.out.println(e.getEmpid()+" "+e.getEmpLoc()+" "+e.getEmpName());*/
		
		//using JSONutility.java utility class
		/*Employee2 e1= new Employee2();
		e1.setEmpid(345);
		e1.setEmpLoc("Mumbai");
		e1.setEmpName("Sachin");
		String empResult=JsonUtility.javaToJson(e1);
		System.out.println(empResult);*/
		
		Person p1=new Person(123, "Rahul", "Pune");
		File f= new File ("./person.json");
		JsonUtility.javaTOJsonInFile(f, p1);
		
	}

}

package com.JavaPracticeSessions;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtility 
{
	public static ObjectMapper m=null;
	 static {
		  m=new ObjectMapper();
		 
	 }
public static String javaToJson(Object o) throws Throwable, JsonMappingException, 
IOException {
	String jsonString=m.writeValueAsString(o);
	return jsonString;
}

public static void javaTOJsonInFile(File f,Object o) throws Throwable, 
JsonMappingException, IOException
{
	m.writeValue(f, o);
}
}

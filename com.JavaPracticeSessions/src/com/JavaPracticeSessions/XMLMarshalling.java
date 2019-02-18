package com.JavaPracticeSessions;

import java.io.File;

import javax.swing.text.AbstractDocument.Content;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XMLMarshalling {

	public static void main(String[] args) throws Throwable {
		Employee e1= new Employee();
		e1.setEmpid(123);
		e1.setEmpLoc("mumbai");
		e1.setEmpName("sachin");
		File f=new File("./xyz");
		
		JAXBContext context=JAXBContext.newInstance(Employee.class);
		
		Marshaller marshal=context.createMarshaller();
		marshal.setProperty(marshal.JAXB_FORMATTED_OUTPUT, true);
		marshal.marshal(e1, f);
		marshal.marshal(e1, System.out);
		

	}

}

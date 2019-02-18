package com.JavaPracticeSessions;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
@JsonPropertyOrder(value= {"empName","empid","empLoc"}) // To display the json nodes in order
public class Employee2 {
	private int empid;
	private String empLoc;
	//@JsonIgnore To ignore thi sjson node
	private String empName;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpLoc() {
		return empLoc;
	}
	public void setEmpLoc(String empLoc) {
		this.empLoc = empLoc;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
}

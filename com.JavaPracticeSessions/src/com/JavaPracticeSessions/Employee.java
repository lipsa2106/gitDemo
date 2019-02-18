package com.JavaPracticeSessions;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
private int empid;
private String empLoc;
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

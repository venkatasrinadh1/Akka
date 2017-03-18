package com.javamembers.akka;

public class EmployeeData {
	
	
	private String name;
	private int age;
	private String sex;
	private String employeeType;
	
	public EmployeeData(){
		
	}
	
	
	public EmployeeData(String name, int age, String sex, String employeeType) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.employeeType = employeeType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	
	

}

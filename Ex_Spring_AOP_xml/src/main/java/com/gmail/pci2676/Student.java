package com.gmail.pci2676;

public class Student {

	private String name;
	private String age;
	private String grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void getStudentInfo() {
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getGrade());
	}
}

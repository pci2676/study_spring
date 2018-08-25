package com.gmail.pci2676;

public class Worker {

	private String name;
	private String age;
	private String department;
	
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void getWorkerInfo() {
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getDepartment());
	}
}

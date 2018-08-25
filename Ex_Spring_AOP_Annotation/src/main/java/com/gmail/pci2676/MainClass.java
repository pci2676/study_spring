package com.gmail.pci2676;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("applicationCTX.xml");
		ctx.refresh();
		
		Student student = ctx.getBean("student",Student.class);
		student.getStudentInfo();
		
		Worker worker = ctx.getBean("worker",Worker.class);
		worker.getWorkerInfo();
	}

}

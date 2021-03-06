package com.gmail.pci2676;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		//생성단계
//		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		//설정단계
//		ctx.load(configLocation);
//		ctx.refresh();
		
		//사용단계
		Student student = ctx.getBean("student1",Student.class);
		System.out.println(student.getName());
		System.out.println(student.getAge());
		
		//종료단계
		ctx.close();
	}

}

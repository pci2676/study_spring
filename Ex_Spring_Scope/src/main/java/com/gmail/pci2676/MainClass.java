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
		Student student1 = ctx.getBean("student",Student.class);
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		
		Student student2 = ctx.getBean("student",Student.class);
		
		student2.setAge(24);
		student2.setName("김민석");
		
		System.out.println(student2.getName());
		System.out.println(student2.getAge());

		System.out.println(student1==student2);
		
		//종료단계
		ctx.close();
	}

}

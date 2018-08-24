package com.gmail.pci2676;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:applicationCTX.xml");
		ctx.refresh();
		
		AdminConnection connection = ctx.getBean("adminConnection",AdminConnection.class);
		System.out.println("adminID : "+connection.getAdminId());
		System.out.println("adminPW : "+connection.getAdminPw());
		System.out.println("sub_adminID : "+connection.getSub_adminId());
		System.out.println("sub_adminPW : "+connection.getSub_adminPw());
		
		ctx.close();
	}

}

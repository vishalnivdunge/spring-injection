package com.springcoreconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class personAdharDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext C = new ClassPathXmlApplicationContext
				("com/springcoreconstructor/config.xml");
		
		person pc = (person)C.getBean("per");
	//	System.out.print(pc);
		System.out.print(" ");
		Adhar pc1 = (Adhar)C.getBean("A");
		System.out.println(pc + " " + pc1 );
	
		

	}

}

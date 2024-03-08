package com.springcoremob;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.setter.Student;

public class mobileDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		
		 ApplicationContext con = new 
		 ClassPathXmlApplicationContext("com/springcoremob/config.xml");
		 
		 mobile sc = (mobile)con.getBean("mob");
		 
		 System.out.println(sc);
		 
		 mobile s = (mobile)con.getBean("mob2");
		 System.out.println(s);
		 
		 mobile mob3 = (mobile)con.getBean("mob3");
	 System.out.println(mob3); 

	}

}

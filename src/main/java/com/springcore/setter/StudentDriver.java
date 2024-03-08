package com.springcore.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver 
{
 public static void main(String[] args) {
	
	 ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/setter/config.xml");
	 
//	 Student sc = (Student)con.getBean("std");
//	 
//	 System.out.println(sc);
	 
	 Student s = (Student)con.getBean("stud");
	 System.out.println(s);
	 
//	 Student s1 = (Student)con.getBean("s1");
// System.out.println(s1);
 
 
}

}

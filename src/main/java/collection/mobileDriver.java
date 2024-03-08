package collection;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mobileDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con = new ClassPathXmlApplicationContext("collection/config.xml");
		
		mobile mb = (mobile)con.getBean("mob");
		
		System.out.println(mb);

	}

}

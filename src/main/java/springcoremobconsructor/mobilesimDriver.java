package springcoremobconsructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcoreconstructor.Adhar;
import com.springcoreconstructor.person;

public class mobilesimDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext M = new ClassPathXmlApplicationContext
				("springcoremobconsructor/config.xml");
		
		mobile mb = (mobile)M.getBean("mob");
		System.out.print(mb);
		
		
	}

}

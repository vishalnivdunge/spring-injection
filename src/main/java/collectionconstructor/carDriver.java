package collectionconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class carDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext c1= new ClassPathXmlApplicationContext("collectionconstructor/config.xml");
		
		car  c = (car)c1.getBean("car1");
		
		car c2= (car)c1.getBean("car2");
		System.out.println(c +" "+ c2  );
		
		
	}

}

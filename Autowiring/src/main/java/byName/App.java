package byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println( "Hello World!" );
	        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	        Department dept=(Department)context.getBean("dept_name");
	        System.out.println(dept.toString());

	}

}

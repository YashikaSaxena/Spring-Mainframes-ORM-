package byType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println( "Hello World!" );
	        ApplicationContext context=new ClassPathXmlApplicationContext("spring_type.xml");
	        Employee em=(Employee)context.getBean("emp_name");
	        System.out.println(em.toString());
	}

}

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//We are using object more than one time.
public class Spring2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");
		Person person = (Person) applicationContext.getBean("p");
		System.out.println(person.getpName());
		System.out.println(person.getCalculator().addition());
		System.out.println(person.getCalculator().multiplication());
		
		//Shutting down IOC container using below.
		ConfigurableApplicationContext applicationContext2 = (ConfigurableApplicationContext)applicationContext;
		
		//To shut down IOC container.
		applicationContext2.registerShutdownHook(); //IOC container will close everything automatically.
	}

}

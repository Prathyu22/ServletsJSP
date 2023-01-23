import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring5Demo {
	public static void main(String args[]) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");
		Question person = (Question) applicationContext.getBean("question");
		System.out.println(person.getAnswers());
		System.out.println(person.getId());
		System.out.println(person.getName());
		
		//Shutting down IOC container using below.
		ConfigurableApplicationContext applicationContext2 = (ConfigurableApplicationContext)applicationContext;
		
		//To shut down IOC container.
		applicationContext2.registerShutdownHook(); //IOC container will close everything automatically.
	}
}

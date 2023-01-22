import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorTest {
	public static void main(String args[]) {
		//Configuring IOC container for class object.
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");
		//default object from the IOC container will be "object" type.
		//Therefore we need to typecast it.
		Calculator calculatorBySetterInjection = (Calculator) applicationContext.getBean("calclass"); //= new Calculator(5,10);
		
		Calculator calculatorByConstructorInjection = (Calculator) applicationContext.getBean("calclass1");
		
		System.out.println(calculatorBySetterInjection.addition());
		System.out.println(calculatorBySetterInjection.subtraction());
		System.out.println(calculatorBySetterInjection.multiplication());
		System.out.println(calculatorBySetterInjection.division());
		System.out.println(calculatorBySetterInjection.modulo());
		System.out.println("------------------------------");
		System.out.println(calculatorByConstructorInjection.addition());
		System.out.println(calculatorByConstructorInjection.subtraction());
		System.out.println(calculatorByConstructorInjection.multiplication());
		System.out.println(calculatorByConstructorInjection.division());
		System.out.println(calculatorByConstructorInjection.modulo());
	}
}

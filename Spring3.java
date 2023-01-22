import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Spring3 {
	public static void main(String args[]) {
		Resource resource = new ClassPathResource("springconfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Calculator student = (Calculator) factory.getBean("calclass");
		System.out.println(student);
	}
}

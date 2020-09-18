import com.kid.config.config;
import com.kid.po.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {


	@Test
	public void test01() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(config.class);
		Person person = (Person) ac.getBean("person");
		System.out.println(person);

	}
}

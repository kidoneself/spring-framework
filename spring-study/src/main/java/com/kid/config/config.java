package com.kid.config;


import com.kid.po.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

	@Bean
	public Person person() {
		return new Person("lisi", 18);
	}

	public static void main(String[] args) {
		final AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(config.class);
		final Person person = (Person) ac.getBean("person");
		System.out.println(person);


	}

}

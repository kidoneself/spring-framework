package org.springframework.studyTest.contextTest;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.study.contextStudy.config.config;
import org.springframework.study.contextStudy.po.Person;

public class contextTest {
	@Test
	public void test01() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(config.class);
		Person person = (Person) ac.getBean("person");
		System.out.println(person);

	}

}

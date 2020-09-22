package org.springframework.studyTest.contextTest;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.study.contextStudy.circulationDependency.boyService;
import org.springframework.study.contextStudy.config.config;


public class contextTest {


	@Test
	public void test01() {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext(config.class);
		annotationConfigApplicationContext.getBean(boyService.class).getGirlService();

	}

}

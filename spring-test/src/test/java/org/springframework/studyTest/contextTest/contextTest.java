package org.springframework.studyTest.contextTest;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.study.contextStudy.circulationDependency.boyService;


public class contextTest {


	@Test
	public void test01() {
		new AnnotationConfigApplicationContext(boyService.class);
	}

}

package org.springframework.study.contextStudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.study.contextStudy.po.Person;

@Configuration
public class config {

	@Bean
	public Person person() {
		return new Person("lizhiqiang", 18);
	}

}

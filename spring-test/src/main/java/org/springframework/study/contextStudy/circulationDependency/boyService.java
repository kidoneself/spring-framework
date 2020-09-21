package org.springframework.study.contextStudy.circulationDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "org.springframework.study.contextStudy.circulationDependency")
public class boyService {

	@Autowired
	private girlService girlService;


	public boyService() {

		System.out.println("boyService");
	}
}

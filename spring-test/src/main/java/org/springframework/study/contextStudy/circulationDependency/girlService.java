package org.springframework.study.contextStudy.circulationDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class girlService {

	@Autowired
	private boyService boyService;

	public girlService() {
		System.out.println("Constructor For GirlService");
	}

	public void getGirlService() {
		System.out.println(boyService);
	}
}

package org.springframework.study.contextStudy.circulationDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class boyService {

	@Autowired
	private girlService girlService;


	public boyService() {
		System.out.println("Constructor For BoyService");
	}

	public void getGirlService() {
		System.out.println(girlService);
	}
}

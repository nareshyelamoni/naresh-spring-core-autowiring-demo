package com.telusko.services;

public class SpringBoot implements ICourse {

	public SpringBoot() {
		System.out.println("SpringBoot class is called..........");
	}

	@Override
	public Boolean getCourse(Double amount) {
		System.out.println("SpringBoot course is enrolled successfully with an amount of "+amount);
		return true;
	}

}

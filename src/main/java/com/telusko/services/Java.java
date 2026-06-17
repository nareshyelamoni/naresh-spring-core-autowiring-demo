package com.telusko.services;

public class Java implements ICourse {

	public Java() {
		System.out.println("Java class is called..........");
	}

	@Override
	public Boolean getCourse(Double amount) {
		System.out.println("Java course is enrolled successfully with an amount of "+amount);
		return true;
	}

}

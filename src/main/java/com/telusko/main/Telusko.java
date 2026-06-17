package com.telusko.main;

import com.telusko.services.*;

public class Telusko {
	
	private ICourse course;
	
	public Telusko(){
		System.out.println("Telusko class is called........");
	}

	public Telusko(ICourse course) {
		System.out.println("constructor called..........");
		this.course = course;
	}

	public void setCourse(ICourse course) {
		System.out.println("setter called.......");
		this.course = course;
	}
	
	public Boolean buyTheCourse(Double amount) {
		return course.getCourse(amount);
	}
}

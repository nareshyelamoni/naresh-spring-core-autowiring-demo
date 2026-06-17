package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LaunchApp2 {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationConfig.xml");
		Telusko t=container.getBean(Telusko.class);
		Boolean status=t.buyTheCourse(4452.8);
		if(status) {
			System.out.println("course enrolled successfully");
		}else {
			System.out.println("course enrolled failed");
		}
	}

}

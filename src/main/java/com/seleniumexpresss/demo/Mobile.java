package com.seleniumexpresss.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	   
		System.out.println("Config Loaded");
		
		Sim sim=context.getBean("Sim",Sim.class);
		
		sim.calling();
		sim.data();
		
	}

}

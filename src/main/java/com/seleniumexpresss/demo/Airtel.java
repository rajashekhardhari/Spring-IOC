package com.seleniumexpresss.demo;

public class Airtel implements Sim{

	Airtel(){
		System.out.println("Airtel construction called");
	}
	
	@Override
	public void calling() {

		System.out.println("callig using Airtel sim");
	}

	@Override
	public void data() {

		System.out.println("browsing internet using Airtel sim");
	}

}

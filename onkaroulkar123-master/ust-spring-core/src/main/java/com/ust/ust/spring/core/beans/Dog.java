package com.ust.ust.spring.core.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dog implements Animal{

	public Dog(){
		System.out.println("Dog object Created");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Dog init Method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Dog destroy method");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Baaaoooooo...");
		
	}

}

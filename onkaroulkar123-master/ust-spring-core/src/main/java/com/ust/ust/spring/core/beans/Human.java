package com.ust.ust.spring.core.beans;

import org.springframework.stereotype.Component;

@Component("human")
public class Human implements Animal{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("bla bla bla.........");
	}

}

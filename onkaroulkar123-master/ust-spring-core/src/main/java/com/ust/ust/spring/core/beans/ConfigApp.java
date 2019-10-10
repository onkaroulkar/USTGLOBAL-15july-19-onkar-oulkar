package com.ust.ust.spring.core.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ust.beanannotationConfig.AutoBean;

public class ConfigApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoBean.class);
		Human h = context.getBean(Human.class);
		h.makeSound();
	}

	
	
}

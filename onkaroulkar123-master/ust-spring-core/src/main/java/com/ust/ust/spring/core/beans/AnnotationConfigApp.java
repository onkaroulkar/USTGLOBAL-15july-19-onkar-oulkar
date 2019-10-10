package com.ust.ust.spring.core.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ust.beanannotationConfig.BeanConfig;

public class AnnotationConfigApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
	    HelloWorld obj = context.getBean(HelloWorld.class);
	    System.out.println(obj.getMsg());
        obj.getAnimal().makeSound();
//	    Animal animal1 = context.getBean(Animal.class);
//	    Animal animal2 = context.getBean(Animal.class);
//	    System.out.println(animal1==animal2); 
        
        
        
        Animal animal1 =(Animal) context.getBean("dog");
	    Animal animal2 =(Animal) context.getBean("dog");
	    System.out.println(animal1==animal2);
        context.close();
	}
}

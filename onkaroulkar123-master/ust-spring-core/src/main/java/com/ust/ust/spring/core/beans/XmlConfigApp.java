package com.ust.ust.spring.core.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.spring.autowiring.Author;
import com.ust.spring.autowiring.Pen;
import com.ust.spring.autowiring.Writer;

public class XmlConfigApp {

	public static void main(String[] args) {
//		HelloWorld obj = new HelloWorld();
//		obj.setMsg("Hello World.........");
		
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld obj2 = context.getBean(HelloWorld.class);
		System.out.println(obj2.getMsg());
		obj2.getAnimal().makeSound();
		System.out.println(obj2.getMap());
		
//		
		Animal animal = context.getBean(Animal.class);
		animal.makeSound();
//		
		
		Animal animal1 = (Animal)context.getBean("Human");
		animal1.makeSound();
//		
//
		Animal animal2 = (Animal)context.getBean("dog");
		animal2.makeSound();
	   
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
        //Writer aut = new Pen();		
	    Author obj1 = 	context.getBean(Author.class);
	    
	    System.out.println(obj1.getName());
	
	}
}

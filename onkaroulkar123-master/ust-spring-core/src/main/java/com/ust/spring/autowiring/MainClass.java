package com.ust.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.ust.spring.core.beans.Human;

public class MainClass {
	
	public static void main(String []args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Author.xml");

		Author author = context.getBean(Author.class);
	    System.out.println(author.getName());
	    author.getWrite().Write();
	    
	 Human human = context.getBean(Human.class);
	    human.makeSound();
	}
	
	
   
}

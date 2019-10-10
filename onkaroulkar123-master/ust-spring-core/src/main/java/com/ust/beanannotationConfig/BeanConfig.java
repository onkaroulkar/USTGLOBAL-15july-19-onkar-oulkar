package com.ust.beanannotationConfig;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ust.ust.spring.core.beans.Dog;
import com.ust.ust.spring.core.beans.HelloWorld;
import com.ust.ust.spring.core.beans.Human;

@Configuration
public class BeanConfig {

	@Bean(name="obj") //autowire = Autowire.BY_TYPE
	public HelloWorld getHelloWorld() {
		HelloWorld helloworld = new HelloWorld();
		helloworld.setMsg("Hello World!!!!!!");
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("abc", 123);
        map.put("xyz", 456);
        helloworld.setMap(map);
	//	helloworld.setAnimal(getDog());   //wiring
        
        return helloworld;
	}
	
	@Bean(name="dog")
	@Scope(value="prototype")
	public Dog getDog() {
		
		return new Dog();
	}
	
	@Bean(name="human")
	public Human getHuman() {
		
		return new Human();
	}
}

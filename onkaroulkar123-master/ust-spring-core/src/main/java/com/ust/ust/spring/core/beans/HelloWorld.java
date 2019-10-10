package com.ust.ust.spring.core.beans;

import java.util.Map;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class HelloWorld implements InitializingBean, DisposableBean{

	private String msg;
	@Autowired                //for auto wire 2nd type...
	@Qualifier("human")
	private Animal animal;
	private Map<String,Integer> map;

	public HelloWorld(){
		System.out.println("Hello object Created");
	}
	
	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("i am destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("i am after Properties");
	}

	
	
	
	
}

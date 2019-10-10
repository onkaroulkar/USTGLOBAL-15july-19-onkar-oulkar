package com.ust.spring.autowiring;

public class Pencil implements Writer{

	@Override
	public void Write() {
		
		System.out.println("Writing using pencil");
	}

}

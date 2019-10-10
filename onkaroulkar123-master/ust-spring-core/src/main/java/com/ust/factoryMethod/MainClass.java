package com.ust.factoryMethod;

public class MainClass {

	public static void main(String[] args) {
		
		FactoryMethod fm = new FactoryMethod();
		Shape shape1 = fm.getShape("Rectangle");
		shape1.draw();
	
		Shape shape2 = fm.getShape("triangle");
		shape2.draw();
	}
}

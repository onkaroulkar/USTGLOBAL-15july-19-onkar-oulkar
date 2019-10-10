package com.ust.factoryMethod;

public class FactoryMethod {

	public Shape getShape(String shapetype) {
		if(shapetype==null)
			return null;

		if(shapetype.equalsIgnoreCase("Triangle"))
			return new Triangle();
		
		if(shapetype.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		
		return null;
	}
	
}

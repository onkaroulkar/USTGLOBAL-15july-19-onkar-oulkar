package com.Exception;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws Customexception {
		
		try {
			System.out.println("enter a and b");
			Scanner s = new Scanner(System.in);
			int a= s.nextInt();
			int b=s.nextInt();
			float c= a/b;
			System.out.println("result "+c);
		} catch (Exception e) {
			
			throw new Customexception();
			
		}
				
		
	}

}

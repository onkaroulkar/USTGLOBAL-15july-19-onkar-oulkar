package com.Exception;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter a and b");
		int a = s.nextInt();
		int b = s.nextInt();

		float c;
		try {
			c = a / b;
			System.out.println("result = " + c);
		} catch (Exception e) {

			System.out.println("enter valid data");
			//e.printStackTrace();
		}

	}

}

package com.entityfile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ImpOperations op=new ImpOperations();
		
		op.add();
		
		System.out.println("Press 1 to show all food items.");
		System.out.println("Press 2 to take order from the customers.");
		System.out.println("Press 3 to operate on food items.");
		System.out.println("Press 4 to total bill of day.");
		
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		
		switch(i) {
		case 1:
			op.show();
			break;
			
		case 2:
			op.order();
			break;
			
		case 3:
			op.operate();
			break;
			
		default:
		System.out.println("Invalid input...");
		
		
		
		}
		
	}

}

package com.dev.corejava;

public class StaticDemo {

	static void show() {
		System.out.println("this is static method");
		show1();
		
	}

	static void show1() {
		System.out.println("static methos can call only satic methos");
		
	}

	void show2() {
		System.out.println("this is non static method");
		show();
		
	}

	public static void main(String[] args) {

		show();
		//show1();
        StaticDemo sy = new StaticDemo();
        sy.show2();
	}

}

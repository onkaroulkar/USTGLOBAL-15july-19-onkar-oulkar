package com.dev.corejava;

class Parent
{
     static  void show ()
	{
		System.out.println("parent class meyhod");
	}
}

public class FinalDemo extends Parent{

	
	
	public static void main(String[] args) {


		FinalDemo o = new FinalDemo();
		o.show();
	}

}

package com.dev.corejava;

interface Printable{  
void print();  
}  
interface Showable{  
void show();  
}  
class MultipleI implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
	MultipleI obj = new MultipleI();
obj.print();  
obj.show();  
 }  
}  

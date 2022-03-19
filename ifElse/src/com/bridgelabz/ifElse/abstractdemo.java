package com.bridgelabz.ifElse;

public class abstractdemo {
	public static void main(String[]args) {
		maheshPhone obj = new sureshPhone(); // cannot instantiate the abstract class
		obj.call();
		obj.cook();
		obj.dance();
		obj.move();
	}

}
abstract class maheshPhone // abstract class
{
	public void call() {
	System.out.println("calling....");
}
public abstract void move(); //abstract methods
public abstract void dance();
public abstract void cook();
}
abstract class rameshPhone extends maheshPhone
{
	public void move()
	{
		System.out.println("moving...");
	}
}
class sureshPhone extends rameshPhone // concrete
{
	
public void dance()
{
	System.out.println("dancing...");
	
}
public void cook()
{
	System.out.println("cooking...");
	
}
}
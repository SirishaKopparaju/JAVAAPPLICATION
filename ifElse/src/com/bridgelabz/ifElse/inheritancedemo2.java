package com.bridgelabz.ifElse;

class animal{  //parent class
	String name;
	
	public void eat() {
	System.out.println("I can eat");
	}	
}
	class Dog extends animal // sub class
	{
		public void display() {
			System.out.println("my name is:"+ name);
		}
	}
	
public class inheritancedemo2 {

	public static void main (String[] args)
	{
		Dog lab = new Dog();
		lab.name = "shu";
		lab.display();
		lab.eat();
     }
                                }


package com.bridgelabz.ifElse;

class calculator{   //SUPER CLASS
	public int add(int a,int b)
	{
		return a+b;
	}
}
class advcal extends calculator //SUBCLASS
{
	public int sub (int a,int b)
	{
		return a-b;
	
	}
}
class advancecal extends advcal //SUBCLASS2
{
	public int mul (int a,int b)
	{
		return a*b;
	}
}
public class inheritancedemo {
public static void main(String[]args)
{
	advancecal c1 = new advancecal();
	int result1 = c1.add(4, 6);
	int result2 = c1.sub(7,3);
	int result3 = c1.mul(4,5);
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	
}
}

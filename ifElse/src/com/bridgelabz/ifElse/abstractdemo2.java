package com.bridgelabz.ifElse;

public class abstractdemo2 {
	public static void main(String[]args)
	{
		Iphone obj = new Iphone();
		samsungM31 obj2 = new samsungM31();
		show(obj);
		show(obj2);
		
	}
public static void show(phone obj)
{
	obj.showConfig();
}
	

}
abstract class phone{
	public abstract void showConfig();
	
}
class Iphone extends phone
{
	public void showConfig()
	{
		System.out.println("2GB,IOS,93");
	}
}
class samsungM31 extends phone
{
	public void showConfig()
	{
		System.out.println("1GB,android,50");
		
	}
}
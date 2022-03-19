package com.bridgelabz.ifElse;

class student{
	private String name;
	private int rollno;
	
	public int getRollno() {
		return rollno;
	}
public void setRollno(int rollno){
	this.rollno = rollno;
}
public String getName() {
	return name;
	
}
public String setName(String name) {
	return this.name = name;
}
}
public class encapsulationdemo {
public static void main (String[]args) {
	student s1 = new student();
	s1.setRollno(2);
	s1.setName("sirisha");
	System.out.println(s1.getRollno());
	System.out.println(s1.getName());
}
}


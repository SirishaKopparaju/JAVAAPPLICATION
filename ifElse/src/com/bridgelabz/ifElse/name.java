package com.bridgelabz.ifElse;
import java.util.Scanner;

public class name {
	
	public static void main(String[]args) {

		Scanner name = new Scanner(System.in);
		System.out.print("enter your name");
		String st = name.nextLine();
		System.out.print("my name is " +st);
		name.close();
	}

}

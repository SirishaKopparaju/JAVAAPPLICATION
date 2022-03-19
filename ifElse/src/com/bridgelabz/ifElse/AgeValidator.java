package com.bridgelabz.ifElse;

import java.util.Scanner;

public class AgeValidator {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in); 
			System.out.print("please enter age:");
			int age=scanner.nextInt();
			if(age>=18) {
				System.out.println("candidate can give vote");
				
			}else {
				System.out.println("candidate should complete 18 years");
			}
		
		
	}

}

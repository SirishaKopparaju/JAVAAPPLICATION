package com.bridgelabz.ifElse;
import java.util.Scanner;


public class multipilcation {
	
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2= sc.nextInt();
		sc.close();
		 multiplications(num1,num2);
		}
		public static int multiplications( int a,int b)
		{
			int c;
			c= a*b;
			System.out.print("multiplication:" +c);
			return c;
		}	

}

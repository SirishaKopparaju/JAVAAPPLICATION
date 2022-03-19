package com.bridgelabz.ifElse;

import java.util.Scanner;

	public class add {
		public static void main(String[]args) {

			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			int num2= sc.nextInt();
			sc.close();
			 additions(num1,num2);
			}
			public static int additions( int a,int b)
			{
				int result;
				result = a+b;
				System.out.print("addition:"+result);
				return result;
			}
}

package demo;

import java.util.Scanner;

public class opearion {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the first number");
		b=sc.nextInt();
		System.out.println("addtion: " + (a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("Mutiplication: "+(a*b));
		System.out.println("Division: "+(a/b));
	}

}

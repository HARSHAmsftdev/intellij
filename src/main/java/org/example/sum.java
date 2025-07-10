package demo;

import java.util.Scanner;

public class sum {

	public static void main(String args[]) {
		int a,b;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a:");
		a = sc.nextInt();
		System.out.println("Enter b:");
		b = sc.nextInt();
		int c = a + b;
		System.out.print(c);
		
	}
}

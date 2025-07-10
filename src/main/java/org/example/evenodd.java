package demo;

import java.util.Scanner;

public class evenodd {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		num =sc.nextInt();
		if(num % 2 != 0)
			System.out.println("This is Odd Number");
		else
			System.out.println("This is Even Number");
	}

}

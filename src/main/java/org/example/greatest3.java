package demo;

import java.util.Scanner;

public class greatest3 {
	public static void greatest(int a,int b,int c) {
		if (a>b && a>c)
			System.out.println(a + " A is the greatest number");
		else if(b>a && b>c)
			System.out.println(b + " B is the greatest number");
		else
			System.out.println(c + " C is the greratest");
		
	}
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		greatest(a,b,c);
		
	}

}

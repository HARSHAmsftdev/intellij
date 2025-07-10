package demo;

import java.util.Iterator;
import java.util.Scanner;

public class palindrome {
	public static void palindrome(String num) {
		char[] n = num.toCharArray();
		String s = "";
//		System.out.println(n);
//		System.out.println(n.length);
		for(int i=n.length - 1;i>=0;i--) {
//			System.out.println(n[i]);
			s = s + n[i];
		}		
		if (num.equals(s))
			System.out.println("It is a Palindrome");
		else
			System.out.println("It is not an Palindrome");
	}
	
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		palindrome(str);
		sc.close();
	}
}

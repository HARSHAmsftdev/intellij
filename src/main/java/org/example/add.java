package demo;
import java.util.Scanner;

class Addition{
	public int add(int a,int b) {
		int result = a+b;
		return result;
	}
}

public class add {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Addition ad = new Addition();
		int result = ad.add(a, b);
		System.out.println(result);

	}
}

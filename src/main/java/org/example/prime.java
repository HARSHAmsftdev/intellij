package demo;
import java.math.BigInteger;
import java.util.Scanner;


public class prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		var isPrime = true;
		if(num<=1)
			isPrime = false;
		for(int i=2;i<num;i++) {
			if(num%i == 0)
				isPrime = false;			
		}
		if(isPrime == true)
			System.out.println("Prime");
		else
			System.out.println("not prime");
	}
	public static boolean isPrime(int num) {
		
	    return BigInteger.valueOf(num).isProbablePrime(10); // 10 = certainty level
	}
}

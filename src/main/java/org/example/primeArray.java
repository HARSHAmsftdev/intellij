package demo;

public class primeArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<arr.length;i++) {
			if(prime(arr[i]))
				System.out.println(arr[i]);
		}
		System.out.println(Math.sqrt(10));
	}
	 public static boolean prime(int num) {
		 if(num<=1)
			 return false;
		 for(int i=2;i<=num/2;i++) {
			 if(num%i == 0) {
				 return false;
			 }
		 }
		 return true;
	 }	
}

package demo;

public class pattern {
	public void pattern (int num) {
		for (int i=1;i<=num;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		int num = 5;
		pattern obj = new pattern();
		obj.pattern(num);
	}
}

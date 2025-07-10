package demo;
class Mobile{
	int price;
	String name;
	
}
public class array {
	public static void main(String[] args) {
		
//		int arr[] = new int[5];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = (int)(Math.random() * 10);
//		}
//		for(int n: arr) {
//			System.out.println(n);
//		}
		Mobile obj1 = new Mobile();
		obj1.price = 12;
		obj1.name = "Samsung";
		
		Mobile mobiles[] = new Mobile[3];
		mobiles[0] = obj1;
		for(Mobile m:mobiles) {
			System.out.println(m);
		}
	}
}

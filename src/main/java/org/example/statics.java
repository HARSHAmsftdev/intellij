package demo;
class Mobiles{
	int id;
	String brand;
	static String name;
	static {
		name = "Smart phone";
	}
	public Mobiles() {
		id = 0;
		brand = "";
	}
	public void show() {
		System.out.println(id + ":" + brand + ":" + name);
	}
	public static void show1(Mobiles obj) {
		System.out.println(obj.id + ":" + obj.brand + ":" + name);
	}
	
}
public class statics {

	public statics() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobiles obj = new Mobiles();
		obj.id = 10;
		obj.brand = "Apple";
		obj.name = "Phone";
		obj.show();
		Mobiles obj1 = new Mobiles();
		obj1.show();
		obj.show1(obj);

	}
	statics obj1 = new statics();
	
}

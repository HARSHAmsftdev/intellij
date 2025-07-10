package demo;

class A{
	public A() {
		System.out.println("in A");
	}
	public A(int a) {
		this();
		System.out.println("in A int");
	}
	
}
class B extends A{
	public B() {
		System.out.println("in B");
	}
	public B(int b) {
		super(5);
		System.out.println("in B int");
	}
}

public class Demo {
	public static void main(String[] args) {
		B obj = new B(2);
		double a =(int)(4.5);
		int b = (int) a;
		System.out.println(a);
		System.out.println(b);
		
	}
}

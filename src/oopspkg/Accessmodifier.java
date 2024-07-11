package oopspkg;

public class Accessmodifier {
	private int a;//instance variable
	int b;
protected int c;
	public static void main(String[] args) {
		
		Accessmodifier ob=new Accessmodifier();
		System.out.println(ob.a);
		System.out.println (ob.b);
		System.out.println (ob.c);
	}

}

package pkg;

public class Swappingnumbers {

	public static void main(String[] args) {
		//--- Swapping two numbers with variables---
		
		int a=30;
		int b=20;
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println(" a="+a);
		System.out.println(" b="+b);
		
		//--- Swapping two numbers without variables---
		int a1=10,b1=20;
		a1=a1+b1;
		b1=a1-b1;
		a1=a1-b1;
		
		System.out.println(" a1="+a1);
		System.out.println(" b1="+b1);
		
		
	}

}

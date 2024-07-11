package oopspkg;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading ob=new Methodoverloading();
		ob.add();
		ob.add(2, 3);
		ob.add(5.5, 10);
        ob.add(8, 1.8);
	}
	
	public void add()
	{
		int a=20,b=30;
		int c=a+b;
		System.out.println(c);
		
	}
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}

}

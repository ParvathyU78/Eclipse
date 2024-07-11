package methodpgm;

public class Shapesarea {

	public static void main(String[] args) {
	Shapesarea ob=new Shapesarea();
	
	ob.rectangle();
	
	int value=ob.square();
	System.out.println(value);
	
	ob.circle(10);
	
   double a =ob.triangle(5, 10);
   System.out.println(a);
	}
	public void rectangle()
	{
		int l=5,b=3,area;
		area=l*b;
		System.out.println(area);
	}
	
	public int square() 
	{
		int s=5,area;
		return area=s*s;
		
		
	}
	public void circle(double r)
	{
		double area;
		area=2*3.14*r;
		System.out.println(area);
	}
	public double triangle(double b,double h) {
		double area;
		return area=0.5*b*h;
		
	}
	
}

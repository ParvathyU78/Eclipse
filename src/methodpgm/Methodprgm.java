package methodpgm;

public class Methodprgm {

	public static void main(String[] args) {
		
		Methodprgm ob=new Methodprgm();
		ob.add();
		
		int value=ob.sub();
		System.out.println(value);
		
		ob.mul(10, 5);
		
		float d=ob.div(10, 5);
		System.out.println(d);

	}
	//1.method without return type and without parameters
	public void add()
	{
		int a=10,b=5;
		int c=a+b;
		System.out.println(c);
		
	}
	//2.method with return type and without parameters
	
	public int sub()
	{
		int a=10,b=5,c;
		c=a-b;
		return c;
		
	}
	//3.method without return type and with parameters
	public void mul(int a, int b) 
	{
	         int c=a*b;
	         System.out.println(c);
	}
	//4.method with returntype and parameter
	
	public float div(int a, int b)
	{
		float c;
		return c=a/b;
		
	}
	
}

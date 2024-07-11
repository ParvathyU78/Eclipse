package oopspkg;

 abstract class Car1
 {
	 abstract public void acceleration();
	 abstract public void speedlimit();
	 public void carcolor()
	 {
      System.out.println("black");
	 }
	
}
 class kia extends Car1
 {

	@Override
	public void acceleration()
	{
		System.out.println("kia acceleration");
		
	}

	@Override
	public void speedlimit()
	{
		System.out.println("kia speedlimit");
		
	}
	 
 }
 class BMW extends Car1{

	@Override
	public void acceleration()
	{
		System.out.println("BMW acceleration");
	}

	@Override
	public void speedlimit()
	{
		System.out.println("BMW speedlimit");
	}
	 
 }
public class Abstractclass {

	public static void main(String[] args) {
		kia ob=new kia();
		ob.acceleration();
         ob.speedlimit();
         
         BMW ob1=new BMW();
         ob1.acceleration();
         ob1.speedlimit();
	}

}



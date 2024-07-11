package oopspkg;
class Vehicle
{
	public void drive()
	{
		System.out.println("running car");
	}
}
class Car extends Vehicle{

	@Override
	public void drive() {
		System.out.println("Repairing a car");
		//super.drive();
	}
	
}

public class Polymorphismpgm {

	public static void main(String[] args) {
		
Car ob=new Car();
ob.drive();
	}

}

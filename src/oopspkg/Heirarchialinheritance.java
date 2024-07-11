package oopspkg;

class Animal
{
	public void animalmethod()
	{
		System.out.println("animal");
	}
}

class Lion extends Animal
{
	public void lionmethod()
	{
		System.out.println("lion");
	}
}

class Tiger extends Animal
{
	public void tigermethod()
	{
		System.out.println("tiger");
	}
}

public class Heirarchialinheritance {

	public static void main(String[] args) {
		Lion ob=new Lion();
		ob.animalmethod();
		ob.lionmethod();
		
		Tiger t=new Tiger();
		t.animalmethod();
		t.tigermethod();	
	}

}

package oopspkg;

class Parent
{
	public void parentmethod()
	{
		System.out.println("parentmethod");
	}
}

class Child extends Parent
{
	public void childmethod() {
		System.out.println("childmethod");
	}
}

public class Singlelevelinheritance {

	public static void main(String[] args) {
		Child ob=new Child();
		ob.parentmethod();
		ob.childmethod();
	}

}

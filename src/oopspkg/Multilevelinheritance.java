package oopspkg;

class Father
{
	public void fathermethod()
	{
		System.out.println("father");
	}
}

class Son extends Father
{
	public void sonmethod()
	{
		System.out.println("son");
	}
}
class Grandson extends Son
{
	public void grandsonmethod()
	{
		System.out.println("grandson");
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		Grandson ob=new Grandson();
		ob.fathermethod();
        ob.sonmethod();
        ob.grandsonmethod();
	}

}

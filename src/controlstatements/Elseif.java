package controlstatements;

public class Elseif {

	public static void main(String[] args) {
		// Greatest among three numbers
		
		int a=10, b=20, c=30;
		if(a>b && a>c)
		{
			System.out.println("a is the greatest number");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is the greatest number");
		}
		else
		{
			System.out.println("c is the greatest number");
		}
	}

}

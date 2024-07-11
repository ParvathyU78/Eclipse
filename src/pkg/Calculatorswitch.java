package pkg;

public class Calculatorswitch {

	public static void main(String[] args) {
		int a=30,b=20;
		char ch='%';
		switch(ch)
		{
		case '+':System.out.println(a+b);
		break;
		case '-':System.out.println(a-b);
		break;
		case '*':System.out.println(a*b);
		break;
		case '/':System.out.println(a/b);
		break;
		
		default :System.out.println("invalid choice");
		//break;
		
		}

	}

}

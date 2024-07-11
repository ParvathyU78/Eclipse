package pkg;

public class Operators {

	public static void main(String[] args) {
		 System.out.println("-----Arithmetic Operator----");
		 
		 int a=20,b=10;
		 
		 System.out.println("a+b="+(a+b));
		 System.out.println("a-b="+(a-b));
		 System.out.println("a*b="+(a*b));
		 System.out.println("a/b="+(a/b));//quotient
		 System.out.println("a%b="+(a%b));//remainder
		 
		 
		 System.out.println("-----Assignment Operator----"); 
		 
		 int c=b;
		 System.out.println(a+=b);//a=a+b 30
		 System.out.println(a-=b);//a=a-b 20
		 
		 System.out.println("-----Relational Operator----"); 
         int v1=20,v2=10;
         System.out.println(v1==v2);
         System.out.println(v1>v2); 
         
         System.out.println("-----Logical  Operator----"); 
         
         String username="Parvathy";
         String password="1234";
         System.out.println(username=="Parvathy"&& password=="1234"); //T
         System.out.println(username=="Parvathy"|| password=="123"); //T
         System.out.println(!(username=="Parvathy")); //F
         
         System.out.println("-----Unary Operator----");
         //++ increment by 1
         //-- decrement by 1
         int   v3=5;
         System.out.println(v3++);//5
         System.out.println(v3);//6
         System.out.println(++v3);//7
         
         System.out.println("-----Ternary  Operator----");
         
         //variable=condition?exp1:exp2
         
         String ans=v1>v2?"v1 is greater":"v2 is greater";
         System.out.println(ans);

	}

}

package controlstatements;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		
		int number,digit,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		while(number>0)
		{
			digit=number%10;//123  123%10=3  12%10=2   1%10=1
			sum=sum+digit;//0+3=3    //3+2=5     5+1=6
			number=number/10;//123/10=12   12/10=1
			
		}
		System.out.println(sum);
	}

}

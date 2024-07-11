package controlstatements;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		
		//           153- 1*1*1+5*5*5+3*3*3
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		int temp=n;
		while(n>0) //153
		{
			int r=n%10;//153%10=3
			s=s+r*r*r;//0+27
			n=n/10;//153/10=15
			
		}
		if(s==temp)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not armstrong");
		}

	}

}

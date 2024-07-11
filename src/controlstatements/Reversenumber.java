 package controlstatements;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		
        int n =sc.nextInt();
		int reverse=0;
		int temp=n;
		while(n>0)
		{
			int r=n%10;
			reverse=reverse*10+r;
			n=n/10;
		}
		System.out.println("Reverse number is"+reverse);
		if(temp==reverse)
		{
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}

}

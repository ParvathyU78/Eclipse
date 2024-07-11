package pkg;

import java.util.Scanner;

public class Dowhileloopprgm {

	public static void main(String[] args) {
		int sum;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sum=a+b;
		System.out.println("sum="+sum);
		}while(sum<=100 && sum>0);
	}

}

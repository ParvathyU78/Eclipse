package pkg;

import java.util.Scanner;

public class Averageof3nos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int sum;
		
		sum=a+b+c;
		System.out.println(sum);
	}

}

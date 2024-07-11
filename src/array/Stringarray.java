package array;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		String[] st=new String[size];
		
	System.out.println("Enter string details");
	
	for(int i=0;i<size;i++)
	{
		st[i]=sc.next();
		
	}
	System.out.println("Entered string");
	for(int i=0;i<size;i++)
	{
		System.out.println(st[i]);
	}

	}

}

package array;

import java.util.Scanner;



public class Charactercountinastring {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		Charactercountinastring v=new Charactercountinastring();
		v.Charactercount(str);
	}
	public void Charactercount(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(!(str.charAt(i)==' '))
			
			count++;
		}
		System.out.println(count);
	}

}

package stringpkg;

import java.util.Scanner;

public class Vowelcountinastring {

	public static void main(String[] args) {
		// vowel count in a string using method (scanner class)
		
		System.out.println("enter a string");
		Scanner sc=new Scanner( System.in);
		String str=sc.next();
		
		Vowelcountinastring v=new Vowelcountinastring();
		v.vowelCount(str);
				
	

}
	public void vowelCount(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
			count++;	
			}
		}
		System.out.println(count);
	}
	
}

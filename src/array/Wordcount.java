package array;

import java.util.Scanner;

public class Wordcount {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc=new Scanner( System.in);
		String words=sc.nextLine();
		System.out.println("Number of words in string are "+words.split(" ").length);
		
	}

}

package stringpkg;

public class Stringpgm {

	public static void main(String[] args) {
		//concat
		String s1="hi";
		String s2="welcome";
		String s4="hello welcome to luminar";
		String s3=new String("Hi");
		
		System.out.println(s1.concat(s2));
		System.out.println(1+2+s1+3+4);
		
		//.equals
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		//touppercase
		//tolowercase
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		//length()
		System.out.println(s1.length());
		
		//startswith and endswith
		
		System.out.println(s4.startsWith("hello"));
		System.out.println(s4.endsWith("luminar"));
		
		//trim
		System.out.println(s4.trim());
		
          //replace
		System.out.println(s4.replace("hello","hi"));
		
		//contains
		System.out.println(s4.contains("welcome"));
		
		//split
		String[] ar=s4.split(" ");
		
		for(String a:ar)
		{
			System.out.println(a);
		}
		//substring
		
		System.out.println(s2.substring(1,4));// welcome o/p-elc
		
		//charAt
		System.out.println(s1.charAt(1));
		
		//tocharArray
		
		char[] c=s1.toCharArray();
		for(char c1:c)
		{
			System.out.println(c1);
		}
		
	}

}

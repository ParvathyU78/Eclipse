package controlstatements;

public class Reverseastring {

	public static void main(String[] args) {
		String str="hello";
		String reversestr="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			reversestr=reversestr+ch;
			
			
		}
		System.out.println("orginal string:"+str);
		System.out.println("Reverse of given string:"+reversestr);
	}

}

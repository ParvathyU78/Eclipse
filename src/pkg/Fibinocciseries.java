package pkg;

public class Fibinocciseries {

	public static void main(String[] args) {
		int n=5,firstterm=0,secondterm=1;
		System.out.println("fibinocciseries till"+n+"terms");
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(firstterm+",");
			int nextterm = firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
			
		}

	}

}

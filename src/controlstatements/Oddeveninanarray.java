package controlstatements;

public class Oddeveninanarray {

	public static void main(String[] args) {
		int a[]= {1,2,5,8,7,3};
		System.out.println("odd numbers:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
		
		System.out.println("even numbers:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
	}

}

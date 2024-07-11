package controlstatements;

public class Digitcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		int count=0;
		while(n>0)   //1234>0   123>0   12>0  1>0  0>0
		{
			n=n/10;  //1234/10=123   123/10=12  12/10=1  1/10=0
			count++; //1    //2   //3  //4
			
		}
		System.out.println("count="+count);

	}

}

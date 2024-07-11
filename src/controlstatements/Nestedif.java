package controlstatements;

public class Nestedif {

	public static void main(String[] args) {
		// age above 18- blood donate, weight -55
		int age=8,weight=75;
		if(age>=18)
		{
			if(weight>=55)
			{
				System.out.println("Blood can be donated");
			}
			else
			{
				System.out.println("Blood cannot be donated as weight is below 55");
			}
		}
		else 
		{
			System.out.println("Blood cannot be donated as age is below 18");
		}

	}

}

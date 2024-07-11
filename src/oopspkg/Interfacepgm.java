package oopspkg;

interface Car11
{
	public void acceleration();
	public void speedlimit();
}

interface Carshop
{
	
}

class Maruti implements Car11,Carshop
{

	@Override
	public void acceleration() {
		System.out.println("Maruti acceleration");
	}

	@Override
	public void speedlimit() {
		System.out.println("Maruti speedlimit");
		
	}
	
}

class Mahindra implements Car11
{

	@Override
	public void acceleration() {
		System.out.println("Mahindra acceleration");
		
	}

	@Override
	public void speedlimit() {
		System.out.println("Mahindra speedlimit");
		
	}
	
}


public class Interfacepgm {

	public static void main(String[] args) {
		Car11 ob=new Maruti();//Car11 reference create cheythu
		ob.acceleration();
         ob.speedlimit();
         
         ob=new Mahindra();
         
        // Mahindra mh=new Mahindra();
       //  mh.acceleration();
       //  mh.speedlimit();
	}

}

package oopspkg;
class Member{
	String name;
	int age;
	int phoneno;
	String address;
	int salary;
	
	public void printdetails()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phoneno="+phoneno);
		System.out.println("address="+address);
		System.out.println("salary="+salary);
	}
}

class Employee extends Member{
	String specialization;
}
class Manager extends Member{
	String departmethod;
}

public class Inheritancepgrm {

	public static void main(String[] args) {
		Employee ob=new Employee();
		ob.name="Hari";
		ob.age=23;
		ob.phoneno=23654789;
		ob.salary=500000;
		ob.address="adgj";
       ob.printdetails();
       System.out.println(ob.specialization="Development");
        
        Manager mg=new Manager();
       System.out.println( mg.departmethod="Hr department");
       
	}

}

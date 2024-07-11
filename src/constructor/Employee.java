package constructor;

public class Employee {
int empid;//instance variable
String empname;
String designation;

	public Employee(int empid,String empname) {//here the value is passed to the empid and empname
		this.empid=empid;
		this.empname=empname;
	}
	
	public static void main(String[] args) {//this value is passing to the this.pointer
		Employee emp=new Employee(101,"abc");
		int id=emp.empid;
		System.out.println(id);
		String name=emp.empname;
		System.out.println(name);

	}

}

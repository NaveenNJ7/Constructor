package Constructoroverloading;

public class Employee {

	String name;
	int id;
	double salary;
	
	Employee(String name, int id, double salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Arun", 101, 15000);
		Employee e2 = new Employee("Kiran", 102, 20000);
		
		System.out.println("Employee details");
		System.out.println("Name :"+e1.name+"\nid :"+e1.id+"\nSalary :"+e1.salary);
		System.out.println("-------------");
		System.out.println("Name :"+e2.name+"\nid :"+e2.id+"\nSalary :"+e2.salary);
		
		/* here we printed two statements instead of printing 2 statements we can use method, 
		see next example student */
	}
}

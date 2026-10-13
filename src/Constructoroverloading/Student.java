package Constructoroverloading;

public class Student {

	String name;
	int id;
	String Department;
	
	
	Student(String name, int id, String Department)
	{
		this.name = name;
		this.id = id;
		this.Department = Department;
	}
	
	void STD()
	{
		System.out.println("Name :"+this.name+"\nid :"+this.id+"\nDepartment :"+this.Department);
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Guru", 35, "Mechanical");
		Student s2 = new Student("Pradeep", 62,"Information science");
		
		s1.STD();
		s2.STD();
		
	}
}

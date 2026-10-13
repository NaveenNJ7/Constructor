package com;

public class Student {

	
	String name;
	int age;
	
	Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		Student s = new Student("Pattu",13);
		Student s1 = new Student("Pritu", 14);
		
		System.out.println("Name :"+s.name+" Age :"+s.age);
		System.out.println("Name :"+s1.name+" Age :"+s1.age);
		
	}
}

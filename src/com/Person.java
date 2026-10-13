package com;

public class Person {
	
	double height = 5.5;
	
	void display()
	{
		double height = 6.5;
		System.out.println(height);      // local
		System.out.println(this.height); // global
	}
	
	public static void main(String[] args) {
		
		Person p = new Person();
		p.display();
	}

}

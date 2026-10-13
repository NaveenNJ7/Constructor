package com;

public class Globallocal {

	
	int age = 20;
	
	Globallocal(int age)
	{
		System.out.println("Age is :"+age);
	}
	
	public static void main(String[] args) {
		
		Globallocal gl = new Globallocal(10);
		
	}
	
	// global and local variable have same name but here local variable will dominate
	// local variable value is 10
}

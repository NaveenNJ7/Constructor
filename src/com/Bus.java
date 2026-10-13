package com;

public class Bus {

	// parameterized constructor
	
	int cost;
	
	Bus(int a)
	{
		cost = a;
	}
	
	public static void main(String[] args) {
		
		Bus b = new Bus(1000);
		System.out.println("Cost of the Bus is: "+b.cost);
	}
}

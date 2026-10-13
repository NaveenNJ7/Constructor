package com;

public class Pen {

	//Parameterized constructor
	
	Pen(int cost)
	{
		System.out.println("Cost of the Pen is: "+cost);
	}
	
	public static void main(String[] args) {
		
		Pen p = new Pen(10);
	}
}

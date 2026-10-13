package Constructoroverloading;

public class Overloading {

	Overloading()
	{
		System.out.println(1);
	}
	
	Overloading(int a)
	{
		System.out.println(2);
	}
	
	Overloading(int a, String b)
	{
		System.out.println(3);
	}
	
	Overloading(String b, int a)
	{
	System.out.println("last constructors both have same DT and varibles names but order is different");
	}
	
	public static void main(String[] args) {
		
		Overloading o = new Overloading();
		new Overloading(5);
		new Overloading(5,"a");
		new Overloading("a",5);
		
	}



}

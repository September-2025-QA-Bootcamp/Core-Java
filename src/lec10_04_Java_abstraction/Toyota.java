package lec10_04_Java_abstraction;

// A regular class
public class Toyota {	
	// Global variable or class variable
	// Inside a class, variable can be declared or initialized
	public int priceOfToyota;
	public int yearOfManufacture = 1885;
	
	// Constructor is declared inside Class
	public Toyota() {
		System.out.println("This constructor is from Toyota class");
	}
	
	// Inside Class, method is implemented, but not [declared or defined]
	// This is a very very important interview question
	
	// non abstract method or implemented method
	public void toyota() {
		System.out.println("This method is from Toyota class");
	}

}

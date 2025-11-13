package lec11_02_Java_abstraction;

// A regular class
// A regular class can inherit only one (regular class or one abstract class) by extends keyword
// A regular class can't inherit an Interface by extends keyword

public class Toyota extends Mercedez {	
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
	
	// we can also create parameterized method, return type method inside a regular class

	// static method is a local method, can be used inside Regular class
	public static void countryOfOrigin() {
		System.out.println("Made in Japan");
	}
	
	// Default methods are allowed only inside interfaces, not in regular class
	/*
	public default void toyotaColor () {
		
	}
	*/
}

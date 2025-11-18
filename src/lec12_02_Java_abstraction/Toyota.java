package lec12_02_Java_abstraction;

// A regular class
// A regular class can inherit only one (regular class or one abstract class) by extends keyword
// A regular class can't inherit an Interface by extends keyword

// implements keyword is used to inherit Interface in regular class
// a regular class can inherit more than one Interface
// a regular class cannot inherit a regular class or abstract class by implements keyword 
// extends keyword used before implements keyword for regular class and abstract class

public class Toyota extends ElectricCar implements Drone, Car {	
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

	@Override
	public void lightWeight() {
		System.out.println("lightWeight method from Drone Interface");
		
	}

	@Override
	public void rent() {
		System.out.println("rent method from Taxi Interface");
		
	}

	@Override
	public void carryingPassenger() {
		System.out.println("carryingPassenger method from Taxi Interface");
		
	}

	@Override
	public void carryingGoods() {
		System.out.println("carryingGoods method from Truck Interface");
		
	}

	@Override
	public void start() {
		System.out.println("start method from Car Interface");
		
	}

	@Override
	public String stop() {
		String m = "stop method from Car Interface";
		System.out.println(m);
		return m;	
	}
	
	@Override
	public void brake(String brakeName) {
		String m = "brake method from Car Interface";
		System.out.println(m);
	}

	@Override
	public void expensive() {
		System.out.println("expensive method from ??? ");
		
	}

	@Override
	public void canFloat() {
		System.out.println("canFloat method from HoverCar Interface");		
	}

	@Override
	public void price() {
		System.out.println("price method from ElectricCar Abstract class");		
	}

	@Override
	public void autoPilot() {
		System.out.println("autoPilot method from Flying Car Abstract class");		
	}

	
	
	// Default methods are allowed only inside interfaces, not in regular class
	/*
	public default void toyotaColor () {
		
	}
	*/
}

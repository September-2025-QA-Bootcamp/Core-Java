package lec02_java_variables;

public class Vehicle {
	
	// access modifier: public, private, protected, default is used below
	public String name = "BMW";
	private int price = 99000; // private can be accessed in the same class
	protected boolean madeInUSA = false;
	char series = 'M'; // in default type, you don't need to write anything
	float rating = 5.0f;
	
	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		System.out.println(vehicle.name);
		
		
	}

}

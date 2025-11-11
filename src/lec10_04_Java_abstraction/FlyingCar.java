package lec10_04_Java_abstraction;

public abstract class FlyingCar {
	// non abstract method
	public void flyingFeature() {
		System.out.println("Flying feature from Flying Car");
	}
	
	// abstract method
	public abstract void autoPilot();

}

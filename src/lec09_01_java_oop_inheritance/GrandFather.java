package lec09_01_java_oop_inheritance;

// a parent class can't inherit a child class
// a child class can inherit a parent class

public class GrandFather {
	// variable
	public int age;
	
	// Constructor
	public GrandFather() {
		System.out.println("I am a Constructor from GrandFather class");
	}
	
	// void type method
	public void grandFatherInfo() {
		System.out.println("GrandFather: Ismail");
	}

}

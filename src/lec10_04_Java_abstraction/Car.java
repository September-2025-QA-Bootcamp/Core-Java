package lec10_04_Java_abstraction;

// Interface names starts with UpperCase 
// They follow Camel case or Snake case pattern.
// CamelCase or Snake_case feature considered from second word, not from first word
// CamelCase example for an Interface --> CarToyota
// Snake_case example for an Interface --> Car_toyota

// Interview Question
// What is Interface?
// Interface is a Blueprint of the Class.
// An interface is a collection of methods that are defined (declared) in nature 

public interface Car {
	// Global variable
	// Inside Interface, variable can not be declared, see line 17
	// public int year;
	
	// Interview question: Can we declare variables inside Interface? 
	// No, we must have to initialize
	// Interview question: what is the feature of variable that can be used inside Interface?
	// the variables inside Interface are static and final in nature.
	public static final int year = 1880;
	// final means you can't change the value of this variable
	// static is a local member of this Interface, other Interface/class can't call it
	
	// Interview question: Does Interfaces have constructors?
	// Ans: No, Interfaces cannot have constructors
	/*
	public Car() {
		
	}
	*/
	
	// Interface doesn't have method body like, methods present in classes
	// and here method is declared inside Interface body, 
	// This is not mandatory to put 'abstract keyword' with the 'abstract method' inside Interface
	// when method is declared, they called abstract method
	public abstract void start();
	public String stop();
	public void brake(String name);
	// These methods can be void type or return type or parameterized type
}

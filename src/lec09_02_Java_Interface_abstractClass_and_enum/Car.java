package lec09_02_Java_Interface_abstractClass_and_enum;

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
	// Interface doesn't have method body like, methods present in classes
	// and here method is declared inside Interface body, 
	// This is not mandatory to put 'abstract keyword' with the 'abstract method' inside Interface
	// when method is declared, they called abstract method
	public abstract void start();
	public String stop();
	public void brake(String name);
	// These methods can be void type or return type or parameterized type
}

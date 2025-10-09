package lec02_java_variables;

public class MyInfo {

	// This is a class body
	// A class body contains first: variables, second: Constructor, third: methods
	// variables name can't be duplicated
	// variable name starts with lower case and follow camel case feature and snake
	// case pattern
	// variables can be either declared (no value assigned) or initialized (value
	// assigned)
	// variables always ended up with a semicolon ;
	// if semicolon is absent, the code will show compilation error
	// Syntax -- rules of coding to write code

	// variable declared
	public String schoolName;

	// variable initialized
	public String country_name = "USA";

	// here, public is access modifier, String is the type of the variable,
	// "myName" is the name of the String type variable
	// String type values are always inside double quotation
	public String myName = "Tofael Kabir";

	// int [We say Integer] is the type of the variable,
	// "myYearlySalary" is the name of the int type variable
	// int type values are with no quotation
	public int myYearlySalary = 123745574;

	// char is the type of the variable,
	// "myGender" is the name of the char type variable
	// char type values are always inside single quotation and best practice to use
	// in upper case
	public char myGender = 'M';

	// boolean is the type of the variable,
	// "usCitizen" is the name of the boolean type variable
	// boolean type values are with no quotation. Represented by true or false in
	// lower case only
	public boolean usCitizen = true;

	// float are used for "non complete/solid number" [a number with decimal]
	// "myHeight" is the name of the float type variable
	// we must have to use lower case f, at the end of float value
	// float type values are with no quotation
	public float myHeight = 5.8f;

	// How to create a Constructor?
	// Constructor name is same as 'Class name', so starts with Upper Case
	// and follow camel case or snake case feature
	// This Constructor is declared here
	public MyInfo() {
		// Constructor Body
		System.out.println("I am a Constructor from MyInfo class");
	}

	public static void main(String[] args) {
		// main method body

		// You have to create an object generally [not mandatory] inside the main method
		// MyInfo (blue color) is a class, tofael (yellow color) is an object, also
		// called reference type variable
		// object name generally start with lower case, follow camel case or snake case
		// feature
		// = equal operator, new is a keyword of Java

		// What happened below? Try to Understand, if don't, no problem
		// an object is created (tofael) (by you) from 'MyInfo' class (following
		// blueprint) which (object) is new and MyInfo type
		// This action (line 73) --> (when an object is created from a class) is called
		// "instantiation", (vvImp info)
		// Then we say the class (MyInfo) is instantiated or Class Instantiated

		// This is not mandatory to write the object name ---> same as class name
		// Also, we can create more than one object from a class

		// When an object [tofael] is created from a class [MyInfo], Constructor is
		// initialized
		// what object do? Ans: object can call the properties [variables, constructor,
		// method] of the class [from where it is created]
		MyInfo tofael = new MyInfo();
		System.out.println(tofael.myName);
		System.out.println(tofael.myHeight);
		System.out.println(tofael.country_name);
		System.out.println(tofael.myGender);
		System.out.println(tofael.myYearlySalary);

		// We can call 2 or more variable at the same time by + symbol, will discuss in
		// next class
		System.out.println(tofael.myName + tofael.myYearlySalary + tofael.country_name);

		MyInfo alex = new MyInfo();
		System.out.println(alex.myName);

		MyInfo jennifer = new MyInfo();
		System.out.println(jennifer.myName);

	}

}

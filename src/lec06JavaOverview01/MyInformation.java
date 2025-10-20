package lec06JavaOverview01;

public class MyInformation {
	// variable declared
	public String myName;
	public byte myAge;
	public short myApartmentRent;
	public int myYearlySalary;
	public long myBankBalance;
	public char myGender;
	public boolean usCitizen;
	public float myHeight;
	public double myGrade;
	
	public String fName = "John";
	public String lName = "Jay";
	
	// Constructor
	// Type: default and parameterized
	
	// default Constructor declared
	// Every class have only one default Constructor
	public MyInformation() {
		System.out.println("------------------ My Info ----------------");
		myInformation();
		findMyName();
		buy();
	}
	
	// parameterized Constructor
	// here String myName is a parameter
	public MyInformation(String myName) {
		this.myName = myName;
		System.out.println(myName);
	}

	// parameterized constructor
	public MyInformation(String myName, int myYearlySalary, char myGender, boolean usCitizen) {
		this.myName = myName;
		this.myYearlySalary = myYearlySalary;
		this.myGender = myGender;
		this.usCitizen = usCitizen;
		System.out.println("Name: " + myName + "\nSalary: " + myYearlySalary + 
				"\nGender: " + myGender + "\nUS Citizen? " + usCitizen);
	}
	
	// method name can be same as class name
	// void type method
	public void myInformation() {
		System.out.println("I am a void type method");
	}
		
	public String findMyName() {
		String fullName = fName + lName;
		System.out.println(fullName);
		return fullName;
	}
	
	// use static for stateless, class-level behavior or class construction; use instance methods when behavior depends on an object’s state or you want polymorphism.
	public static void buy() {
		System.out.println("This is a static method, called by class directly");
	}
	
	public void myInformation(String myName, int myYearlySalary, char myGender, boolean usCitizen) {
		System.out.println("Name: " + myName + "\nSalary: " + myYearlySalary + 
				"\nGender: " + myGender + "\nUS Citizen? " + usCitizen);
	}
	
	// New
	public void allMethods() {
		myInformation();
		findMyName();
	}
	
	
	

	
	
	
	

}

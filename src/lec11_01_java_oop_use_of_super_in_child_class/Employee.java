package lec11_01_java_oop_use_of_super_in_child_class;

// child class/sub class: Employee, Parent Class/Base Class/Super Class: MountSiani
// Above line is important, Memorize it, all names are used in industry

public class Employee extends MountSinai {
	// Global variable declared
	public String empName;
	public int empId;
	public char empGender;
	public boolean fullTimeEmp;
	
	// default constructor
	// super() method is used to call/initialize either the default or parameterized constructor of super (parent/base) class 
	// try to put the super method (after sysout of default constructor) and find the below outcome
	// Constructor call [super()] must be the first statement inside a constructor of the child class 
	// We can use only one super() method inside any constructor
	// Either default (line 21)  or parameterized constructor (line 22) can be called/initialized by super method
	// That's why we use java comments in the below line 21
	public Employee() {
		// super();
		super("Bronx", 6);
		
		// super keyword is used to call (initialize) any types of method from super (Parent) class
		super.msInfo();
		super.mountSinaiInfo("Staten Island", 7);
		super.mountSinaiInfo("Terry Town", 8);
		
		// super keyword is also used to call (initialize) the variables of super (Parent) class
		super.inNewYork = true;
		super.rating = 9.23f;		
		System.out.println("Is this hospital in NY? Ans: " + inNewYork + " and The rating is: " + rating);
		
		// if variable is initialized inside parent, we can directly call them like below line
		System.out.println(super.direction);
		
		System.out.println("This is a default constructor from the Child class Employee");
	}	
	
	// parameterized Constructor
	// Inside Parameterized Constructor, super() and super keyword do same function as they did inside "default constructor"
	public Employee(String empName, int empId, char empGender, boolean fullTimeEmp) {
		// super();
		super("Brooklyn", 10);
		
		super.msInfo();
		super.mountSinaiInfo("Nassau County", 10);
		
		super.inNewYork = false;
		super.rating = 7.5763f;
		System.out.println("Is this hospital in NY? Ans: " + inNewYork + " and The rating is: " + rating);		
		
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		this.fullTimeEmp = fullTimeEmp;
		System.out.println("Name: " + empName + ", Id: " + empId + ", Gender: " + empGender + " and Full time employee? : " + fullTimeEmp);	
		
	}

	// void type or no return method or non parameterized method
	// Super keyword is not used in the static  Method
	public void empInfo() {
		// Inside a method of the child class, we can't call "Constructor" of super class by super() method
		// super();
		
		super.msInfo();
		super.mountSinaiInfo("Orange County", 15);
		
		super.inNewYork = false;
		super.rating = 8.332f;
		System.out.println("Is this hospital in NY? Ans: " + inNewYork + " and The rating is: " + rating);	
		
		System.out.println("This is a void type method from child class Employee");
	}
	
	// parameterized method
	public void employeeInfo(String empName, int empId, char empGender, boolean fullTimeEmp) {
		// we can't call constructor of super class inside a method of child class.
		// super();

		super.msInfo();
		super.mountSinaiInfo("Staten Island", 19);

		super.inNewYork = true;
		super.rating = 9.8f;
		System.out.println("Is this hospital in NY? Ans: " + inNewYork + " and The rating is: " + rating);

		System.out.println("Name: " + empName + ", Id: " + empId + ", Gender: " + empGender + " and Full time employee? : " + fullTimeEmp);	
		
	}
		
}

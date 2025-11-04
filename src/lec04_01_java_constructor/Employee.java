package lec04_01_java_constructor;

public class Employee {

	// variables declared
	public String empName;
	public int empId;
	public char empGender;
	public boolean fullTimeEmployee;

	// Constructor are 2 types --
	// default constructor (no argument constructor) and parameterized constructor
	// A class can contain one default constructor and one or (more than one)
	// parameterized constructor
	// Default Constructor must be declared before parameterized constructor.
	// You shouldn't write a parameterized constructor without writing a default
	// constructor. It's a norm.

	// default constructor declared
	public Employee() {
		System.out.println("I am Default Constructor from Employee Class");
	}

	// parameterized Constructor declared -01
	public Employee(String empName) {
		this.empName = empName;
		System.out.println("Employee Name: " + empName);
	}

	// parameterized Constructor declared -02
	// how to create --> select variable ---> right click --> source ---> Generate Constructor using fields --> choose insertion point
	public Employee(String empName, int empId, char empGender, boolean fullTimeEmployee) {
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("Employee Name: " + empName + ", Employee Id: " + empId + ", Employee Gender: " + empGender
				+ ", Full Time Employee: " + fullTimeEmployee);
	}

}

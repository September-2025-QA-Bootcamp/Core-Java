package lec04_01_java_constructor;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee = new Employee(); //default constructor initialized
		
		Employee employee2 = new Employee("Mozammel"); //parameterized constructor initialized -01
		
		Employee employee3 = new Employee("Mozammel", 30, 'M', true); //parameterized constructor initialized -02
		
	
		
	}

}

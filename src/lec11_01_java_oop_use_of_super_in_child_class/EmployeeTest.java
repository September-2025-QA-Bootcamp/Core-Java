package lec11_01_java_oop_use_of_super_in_child_class;

public class EmployeeTest {
	public static void main(String[] args) {
		System.out.println("\n-----//----- default constructor initialized from The Child Class Employee -----//------");
		Employee employee = new Employee();
		
		System.out.println("\n-----//----- parametrized constructor initialized from The Child Class Employee ------//-----");
		Employee employee2 = new Employee("Alex", 423403, 'M', false);
		
		System.out.println("\n-----//----- void type method initialized from The Child Class Employee -----//------");
		employee.empInfo();
		
		System.out.println("\n-----//----- parameterized method initialized from The Child Class Employee -----//------");
		employee.employeeInfo("Julie Amstrong", 657362, 'F', true);
		
		System.out.println("\n-----//----- default constructor initialized from The Parent Class Mount Sinai ------//-----");
		MountSinai mountSinai = new MountSinai();
		
		System.out.println("\n-----//----- parameterized constructor initialized from The Parent Class Mount Sinai ------//-----");
		MountSinai mountSinai2 = new MountSinai("Manhattan", 4);
		
		System.out.println("\n-----//----- void type method initialized from The Parent Class Mount Sinai ------//-----");
		mountSinai.msInfo();
		
		System.out.println("\n-----//----- parameterized method initialized from The Parent Class Mount Sinai -----//------");
		mountSinai.mountSinaiInfo("Queens", 3);
	}
}

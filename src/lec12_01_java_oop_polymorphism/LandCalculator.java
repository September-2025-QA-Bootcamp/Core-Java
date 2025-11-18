package lec12_01_java_oop_polymorphism;

public class LandCalculator {
	// void type non parameterized method (1) is implemented
	// method name can be same as class name but in lower case
	public void landCalculator() {
		System.out.println("This is void type method from Land Calculator");
	}
	
	// void type parameterized method (2) implemented
	public void landCalculator(int a, int b) {
		int total=a+b;
		System.out.println("Total area from Land Calculator: " + total);
	}
	
	// return type parameterized method (3) implemented
	// if you write like (int c, int b, int a) in a separate method or like (int d, int e, int f) , it will not work
	// same variable type is the problem, how many parameters, this is not an issue
	// it allows the same number of parameter, when parameter types are different in a different position [combination]
	public int landCalculator(int a, int b, int c) {
		int total=a+b+c;
		System.out.println("Total area from Land Calculator: " + total);
		return total;
	}
	
	// void type parameterized method (4) implemented
	// Memorize it: how to convert a string to int? Ans: Integer.parseInt()
	// line 20 vs 30, although number of parameter same, method name same, but parameter type is different
	// same number of parameter, same type of parameter in the same position --> not allowed
	// Different position is ok
	public void landCalculator(int d, String e, int f) {
		int total=d+Integer.parseInt(e)+f;
		System.out.println("Total area from Land Calculator: " + total);
	}

	// return type parameterized method (5) implemented
	// float = 2.334f
	// int = 2
	// if you wanna convert a float to an int, you have to narrow down from wider, so we have to use casting
	public int landCalculator(float d, String e, int f) {
		int total = (int)d+Integer.parseInt(e)+f;
		System.out.println("Total area from Land Calculator: " + total);
		return total;
	}
	
	// Return type parameterized method (6) which is final type and implemented
	// Also called final method, final method can't be changed
	// Final type of method can be overloaded --> important interview question
	// it is not mandatory the final method to be return type, it can be void type or non parameterized too
	public final int landCalculator(int a, int b, int c, int d) {
		int total=a+b+c+d;
		System.out.println("Total area from Land Calculator: " + total);
		return total;
	}
	
	// Static type Method (7) implemented
	// Static method can be overloaded --> important interview question
	// Who is static? static is a local member method of a class
	public static void landCalculator(int a, int b, int c, int d, int e) {
		int total=a+b+c+d+e;
		System.out.println("Total area from Land Calculator: " + total);
	}
	
	/*
	 Summary:
	 for method overloading, 
	 1) method can be void type or return type
	 Parameterized or non parameterized type
	 static or non static, final or not final
	 2) count number of parameter, if parameter number is same, 
	 then see the sequence of data type in parameter
	 If the sequence is different, then it is allowed.
	 */
	
	
	
	
	
	
	
	
	
	

}

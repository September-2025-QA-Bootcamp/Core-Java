package lec12_01_java_oop_polymorphism;

public class ModernCalculator extends LandCalculator {
		// void type non parameterized method (1) is implemented
		@Override
		public void landCalculator() {
			System.out.println("This is void type method from Land Calculator");
			System.out.println("Method name is same as parent, but syntax or logic is changed in the method body");
		}
		
		// void type parameterized method (2) implemented
		@Override
		public void landCalculator(int a, int b) {
			int total=a+b+63;
			System.out.println("Total area from Land Calculator: " + total);
		}
		
		// return type parameterized method (3) implemented
		@Override
		public int landCalculator(int a, int b, int c) {
			int total=a/2+b*3+c+21;
			System.out.println("Total area from Land Calculator: " + total);
			return total;
		}
		
		// void type parameterized method (4) implemented
		@Override
		public void landCalculator(int d, String e, int f) {
			int total=d/2+Integer.parseInt(e)+f-77;
			System.out.println("Total area from Land Calculator: " + total);
		}

		// return type parameterized method (5) implemented
		@Override
		public int landCalculator(float d, String e, int f) {
			int total = (int)d+Integer.parseInt(e)+f-2;
			System.out.println("Total area from Land Calculator: " + total);
			return total;
		}
		
			
		// The purpose of override is to bring changes in logic [method body]
		// no change is also ok, if we want same as parent class method

		// Return type parameterized method which is final and implemented
		// Final type method cannot be Overriden --> important interview question
		// Cannot override the final method from LandCalculator, Why?
		// Final keyword doesn't allow any changes in the method, variable, class
		/*
		@Override
		public final int landCalculator(int a, int b, int c, int d) {
			int total=a+b+c+d;
			System.out.println("Total area from Land Calculator: " + total);
			return total;
		}
		*/
		

		// Static type Method (7) implemented
		// important interview question
		// This below method - landCalculator can't override or implemented. Why?
		// because static is a local member method of a class
		// So, static method can't be override, if we remove @override it will work as
		// the static method of this modern calculator class
	
		
		/*	
		@Override
		public static void landCalculator(int a, int b, int c, int d, int e) {
			int total=a+b+c+d+e;
			System.out.println("Total area from Land Calculator: " + total);
		}
		*/	

		
		
		
		
		

}

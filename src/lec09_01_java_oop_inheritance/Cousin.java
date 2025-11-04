package lec09_01_java_oop_inheritance;

// Line 7 is not possible, because you can use "only one" extends keyword
//"public class Cousin extends Aunt extends GrandFather" -- not possible
// Example of Single Inheritance

public class Cousin extends Aunt {
	public void cousinInfo() {
		System.out.println("Cousin: Maya, Aunt: Jamila, Grandfather: Ismail");
	}
}

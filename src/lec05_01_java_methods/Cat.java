package lec05_01_java_methods;

public class Cat {

	public String color = "White";
	public int price = 500;

	public Cat() {
		System.out.println("hi");
		System.out.println("hello");
		System.out.println("I am constructor");
	}

	// void type method

	public void catColor() {
		System.out.println("The color of the Cat is: " + color);
	}

	public void catPrice() {
		System.out.println("The price of the Cat is: " + price);
	}

	public static void main(String[] args) {

		Cat cat = new Cat();
		cat.catColor();
		cat.catPrice();

	}

}

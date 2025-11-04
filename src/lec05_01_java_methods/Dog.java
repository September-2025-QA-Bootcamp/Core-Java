package lec05_01_java_methods;

public class Dog {

	// Global variable
	public String breed = "BullDog";
	public int age = 2;

	public String firstName = "Alex";
	public String lastName = "Chao";

	public double price = 500.50;

	// void type method
	public void breedType() {
		System.out.println("The Breed: " + breed);
	}

	// return type method
	public String breedOfTheDog() {
		System.out.println("The breed of the dog is: " + breed);
		return breed;
	}

	public String fullNameOfTheDogOwner() {
		// Local variable
		String fullName = firstName + " " + lastName;
		System.out.println("The full name of the Dog owner is: " + fullName);
		return fullName;
	}

	public int ageOfTheDog() {
		System.out.println("The age of the Dog is: " + age);

		return age;
	}

	public double priceOfTheDog() {
		System.out.println("The price of the dog is: " + price);
		return price;
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.breedType();
		dog.breedOfTheDog();
		dog.fullNameOfTheDogOwner();
		dog.ageOfTheDog();
		dog.priceOfTheDog();

	}

}

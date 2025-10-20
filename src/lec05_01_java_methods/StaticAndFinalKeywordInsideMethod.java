package lec05_01_java_methods;

public class StaticAndFinalKeywordInsideMethod {
	
	// non static properties cannot be used inside static properties
	// Thats why below line is static
	public static String breed = "BullDog";
	public int age =6;
	
	//void type static method
	// static is a local member method of this class
	// other class can't call it/get it	
	public static void breedType() {
		System.out.println("The Breed: " + breed);
	}
	
	//return type static method
	public static String breedOfTheDog() {
		System.out.println("The Breed of the Dog is: " + breed);
		return breed;
	}
	
	//return type final method
	// when there is a final keyword, you can't change the method
	// what does it mean by change?
	// sometime methods are called and changed by "method overriding"
	// we will learn it later
	// final keyword can be used in void type method too
	public final int ageOfTheDog() {
		System.out.println("The age of the Dog is: " + age);
		return age;
	}
	
	public static void main(String[] args) {
		
		StaticAndFinalKeywordInsideMethod sf = new StaticAndFinalKeywordInsideMethod();
		StaticAndFinalKeywordInsideMethod.breedType();
		StaticAndFinalKeywordInsideMethod.breedOfTheDog();
		sf.ageOfTheDog();
		
		
		
	}
	

}

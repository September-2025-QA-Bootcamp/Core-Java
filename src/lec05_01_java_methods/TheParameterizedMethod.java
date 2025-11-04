package lec05_01_java_methods;

public class TheParameterizedMethod {
	
	//void type parameterized method
	// What is the Advantage of parameterized methods?
	// it can be reused
	// Here, String breed, int price are parameter
	public void breedType(String breed, int price) {
		System.out.println("The breed of the dog is: " + breed + "\nPrice: " + price);
	}
	
	
	// can a method be parameterized when they are return type? Yes
	// if a method is parameterized, then no need of variables
	// here int price1, int price2 are parameter
	public int totalPrice(int price1, int price2) {
		int total = price1 + price2;
		System.out.println("Total price of the dogs are: " + total);
		return total;
	}
	
	// parameterized method can be void type or return type
	// parameterized method can be static type or final type
	
	public static void main(String[] args) {
		TheParameterizedMethod pm = new TheParameterizedMethod();
		pm.breedType("Pitt Bull", 500); //arguments used here
		pm.breedType("Doverman", 1000);
		
		pm.totalPrice(100, 200);
		pm.totalPrice(300,600);
	}

}

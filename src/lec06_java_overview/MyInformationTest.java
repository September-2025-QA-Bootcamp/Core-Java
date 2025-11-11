package lec06_java_overview;

public class MyInformationTest {

	public static void main(String[] args) {
		// default Constructor Initialized, when an object is created [next line]
		MyInformation a1 = new MyInformation();
		a1.myInformation();
		a1.findMyName();
		MyInformation.buy();
		a1.myInformation("Joshim", 100, 'M', false);
		
		System.out.println("---------------------------\n");
		MyInformation a2 = new MyInformation("Kalam"); // Kalam is called argument
		MyInformation a3 = new MyInformation("John"); 
		MyInformation a4 = new MyInformation("Alex"); 
		
		System.out.println("---------------------------\n");
		MyInformation a5 = new MyInformation("Bill", 4234234, 'M', true); 
		
		System.out.println("---------------------------\n");
		MyInformation a6 = new MyInformation("Ariel", 1234234, 'F', false); 
		
		System.out.println("---------------------------\n");
		MyInformation a7 = new MyInformation("Charlie", 14234234, 'M', true); 
		
		
		MyInformation rr = new MyInformation();
		
		
		
		MyInformation all = new MyInformation();
		all.allMethods();
		
		

	}

}

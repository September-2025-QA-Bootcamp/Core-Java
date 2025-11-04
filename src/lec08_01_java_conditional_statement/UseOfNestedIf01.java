package lec08_01_java_conditional_statement;

import java.util.Scanner;

public class UseOfNestedIf01 {

	public static void main(String[] args) {
		// Condition: To donate blood, you must be greater than or equal to 18 years old
		// and your weight should be more than 150 lbs
		System.out.println("--- Please Enter your age: ----");

		Scanner scanner = new Scanner(System.in);

		// Creating variable for age
		int age = scanner.nextInt();

		if (age >= 18) {

			System.out.println(" --- Please Enter your Weight here :---");
			// Creating variable for weight
			int weight = scanner.nextInt();

			// applying condition on weight
			// nested/inner if block
			if (weight > 150) {
				System.out.println(
						"You're eligible to donate blood as your weight is " + weight + " lbs and age is: " + age);
			} else {
				System.out.println("You're not eligible to donate blood as your weight is " + weight
						+ "lbs, although eligible age is " + age);
			}
		}

		else {
			System.out.println("Your age should be more than or equal to 18 to donate blood");
		}	
		
		scanner.close();

	}

}

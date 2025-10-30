package lec08_01_java_conditional_statement;

import java.util.Random;

/*
Even number (2, 4, 6, 8, 10, ......): A number divided by 2 with a remainder/modulus of 0.
Example 56 : 56/2 --- divisor 2, dividend 56, quotient 28, remainder/modulus 0

Odd number (1, 3, 5, 7, 9, .......) : A number divided by 2 with a remainder of 1.
Example 37 : 37/2 --- divisor 2, dividend 37, quotient 18, remainder/modulus 1

Is 0 an Even Number? The answer is easy: Yes, zero is an even number. 
Usually, zero together with the even numbers, 
so certainly it is not an odd number. An even number is formally defined as an integer of the form n = 2x, 
where x is an integer.
an odd or even number can also be negative

Logically how we write as code:

val % 2 == 1   "represent odd number"
val % 2 == 0   "represent even number"

num % 7 == 3 ---> represent, if we divide num with 7, the remainder is 3

 */

public class OddOrEvenNumberUsingRandomClass {

	public static void main(String[] args) {

		Random random = new Random();
		int val = random.nextInt();

		if (val % 2 == 0) {
			System.out.println(val + " is an Even Number");
		} else if (val % 2 == 1) {
			System.out.println(val + " is an ODD Number");
		} else {
			System.out.println("The system failed to execute this order");
		}

	}

}

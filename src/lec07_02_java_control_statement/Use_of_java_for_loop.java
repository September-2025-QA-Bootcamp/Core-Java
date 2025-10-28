package lec07_02_java_control_statement;

import java.util.Iterator;

/*	

for(initialization block with data type; conditional block; incremental or decremental block) {
		System.out.println()
		or we can use condition
}
*/

public class Use_of_java_for_loop {

	public static void main(String[] args) {

		// incremental block is used here
		System.out.println("-------------- for loop 01 --------------\n");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		// 0, 1, 2, 3, 4

		System.out.println("\n-------------- for loop (incremented by 2) --------------\n");
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
		// 1,3,5,7,9

		System.out.println("\n-------------- for loop (incremented by 3) --------------\n");
		for (int i = -5; i <= 10; i += 3) {
			System.out.println(i);
		}
		// -5, -2, 1, 4, 7, 10

		System.out.println("\n---------- for loop 04  ----------\n");
		for (double i = 5.5; i < 13; i = i + 2.5) {
			System.out.println(i);
		}

		System.out.println("\n---------- for loop 05  ----------\n");
		int j = 2;
		for (int i = 1; i < 10; i = i + 3) {
			System.out.println(" the valuse are: " + i * j);
		}
		// 1, 4, 7
		// 2, 8, 14

		System.out.println("\n---------- for loop 06, condition false  ----------\n");
		for (int i = 0; i > 10; i++) {
			System.out.println(i);
		}
		// if the condition is false, loop terminated, value of i will not move to the
		// for loop body

		// decremental block is used here
		System.out.println("\n---------- for loop 07, decremental  ----------\n");
		for (int i = 10; i > 5; i--) {
			System.out.println(i);
		}
		// 10, 9, 8, 7, 6

		System.out.println("\n---------- for loop 08, condition is false  ----------\n");
		for (int i = 5; i < 2; i--) {
			System.out.println(i);
		}
		// as condition is false, nothing will execute/print

		// very common mistake by new comer
		// this is infinite loop, so comment out not to run, common mistake when you
		// select wrong incremental block
		/*
		 * System.out.println("\n---------- for loop 09, inifinite loop  ----------\n");
		 * for(int i = 10; i > 0; i++) { System.out.println(i); }
		 */

		System.out.println("\n---------- for loop 10  ----------\n");
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}

		System.out.println("\n---------- for loop 11  ----------\n");
		int m = 2;
		for (int i = 18; i > 10; i = i - 3) {
			System.out.println(i + m);
		}
		// 18, 15, 12
		// 20, 17, 14

		System.out.println("\n---------- for loop 12  ----------\n");
		int n = 2;
		for (int i = 25; i > 10; i -= 3) {
			System.out.println(i / n);
		}
		// 25, 22, 19, 16, 13
		// 12, 11, 9, 8, 6

		System.out.println("\n---------- for loop 13, condition is false  ----------\n");
		int l = 2;
		for (int i = 25; i < 20; i -= 3) {
			System.out.println(i + l);
		}
		// as condition is false, nothing will execute/print

		System.out.println("---------------- Real time coding -------------------------");

		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("Even Number " + i);
			} else if (i % 2 == 1) {
				System.out.println("Odd Number " + i);
			} else {
				System.out.println("System Failure");
			}

		}

	}

}

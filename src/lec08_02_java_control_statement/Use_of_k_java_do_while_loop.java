package lec08_02_java_control_statement;

public class Use_of_k_java_do_while_loop {

	public static void main(String[] args) {

		System.out.println("----------for loop----------");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		System.out.println("----------while loop----------");
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}

		System.out.println("---------- do while loop, Condition is true----------");
		int j = 0;
		do {
			System.out.println(j);
			j++;
		} while (j < 5);

		System.out.println("---------- do while loop, Condition is false----------");
		int k = 1000;
		do {
			System.out.println(k);
			k += 3;
		} while (k < 4);

	}

	
}

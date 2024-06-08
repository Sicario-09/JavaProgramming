package practiceTest_Java_1;

import java.util.Scanner;

public class PrimeNumOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num ...");
		int num = sc.nextInt();

		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}

			if (count == 2) {
				System.out.println(num + " is a prime num");
			} else {
				System.out.println(num + " is not a prime num");
			}
		} else {
			System.out.println("not a prime num");
		}

	}

}

package practiceTest_Java_1;

import java.util.Scanner;

public class FactorialNum {

	// A Factorial is a function that multiplies a num by every num below it e.g.,
	// 5! = 1*2*3*4*5 = 120

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a num.... ");
		int num = sc.nextInt();

		long factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i; // 1 2 6 24 120
		}
		System.out.println("The factorial of a num is... " + factorial);

	}

}

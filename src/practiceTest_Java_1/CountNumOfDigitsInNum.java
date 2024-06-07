package practiceTest_Java_1;

import java.util.Scanner;

public class CountNumOfDigitsInNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num ...");
		int num = sc.nextInt();

		int count = 0;

		while (num > 0) {
			num = num / 10;
			count++;
		}

		System.out.println("Num of Digits arec: " + count);

	}

}

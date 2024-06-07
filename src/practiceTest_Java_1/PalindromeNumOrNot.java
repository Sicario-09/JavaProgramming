package practiceTest_Java_1;

import java.util.Scanner;

public class PalindromeNumOrNot {

	// A palindrome num is a num that remains the same when it's digits are
	// reversed. e.g.,--> 121, 16461, etc.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = sc.nextInt();

		int org_num = num;

		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10; // 0*10 + 1234%10 --> 4 | 4*10 + 123%10 --> 40 + 3=43 | 43*10 + 12%10 -->430 +2=
										// 432 | 432*10 + 1%10 --> 4320 + 1=4321
			num = num / 10;

		}
		
		if(org_num==rev) {
			
			System.out.println(org_num + "... is a Palindrome num");
		}
		else
		{
			System.out.println(org_num + "... is not a Palindrome num");
		}

	}
}

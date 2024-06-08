package practiceTest_Java_1;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num ...");
		int a = sc.nextInt();

		System.out.println("Enter second num ...");
		int b = sc.nextInt();

		System.out.println("Enter third num ...");
		int c = sc.nextInt();

		// Logic 1 - Logical operators

//		if(a>b && a>c)
//		{
//			System.out.println(a+ " is a largest num");
//		}
//		else if(b>a && b>c)
//		{
//			System.out.println(b + " is a largest num");
//		}
//		else
//		{
//			System.out.println(c+ " is a largest num");
//		}

		// Logic 2 - using ternary operator

		int larg1 = a > b ? a : b;

		int larg2 = c > larg1 ? c : larg1;

		System.out.println(larg2 + " is a largest num.");

	}

}

package practiceTest_Java_1;

import java.util.Scanner;

public class ThreeDiffWaysToReverseANum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = sc.nextInt();

		// Logic 1 - using algorithm

//		int rev = 0;
//		while (num != 0) 
//		{
//			rev = rev*10 + num%10 ; // 0*10 + 1234%10 --> 4 |  4*10 + 123%10 --> 40 + 3=43 | 43*10 + 12%10 -->430 +2= 432 | 432*10 + 1%10 --> 4320 + 1=4321 
//			num = num/10 ;          // 1234/10 --> 123      |  123/10=12                   | 12/10 = 1                    | 1/10 = 0 
//		}

		// Logic 2 - using StringBuffer Class

//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		
//		StringBuffer rev = sb.reverse();

		// Logic 3 - using StringBuilder class

		StringBuilder sbl = new StringBuilder();

		sbl.append(num);

		StringBuilder rev = sbl.reverse();

		System.out.println("Reverse num is ....." + rev);

	}

}

package practiceTest_Java_1;

import java.util.Scanner;

public class PalindromeStringOrNot {

	// A palindrome num is a num that remains the same when it's digits are
	// reversed. e.g.,--> Madam, Papa, etc.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String...");
		String str = sc.next();
		
		String org_str = str ;
		
		String rev = "";
		
		int len = str.length();           // 7
		
		for(int i=len-1; i>=0; i--)      // 6 5 4 3 2 1
		{
			rev = rev + str.charAt(i);   // m a h b u h S
		}
		
	if(org_str.equalsIgnoreCase(str)) {
			
			System.out.println(org_str + "... is a Palindrome string");
		}
		else
		{
			System.out.println(org_str + "... is not a Palindrome string");
		}

		

	}

}

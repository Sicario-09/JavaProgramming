package practiceTest_Java_1;

import java.util.Arrays;

public class TwoArraysAreEqualOrNot {

	public static void main(String[] args) {

		// Logic 1 - by using equals method

		int a1[] = { 1, 2, 3, 4, 5 };
		int a2[] = { 1, 2, 3, 4, 5 };

//		boolean status = Arrays.equals(a1, a2);
//		
//		if(status==true)
//		{
//			System.out.println("Arrays are equal");
//		}
//		else
//		{
//			System.out.println("Arrays are not equal");
//		}

		// Logic 2 - by using logic

		boolean status1 = true;

		if (a1.length == a2.length) {
			// compare rest of elements in arrays
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] != a2[i]) {
					status1 = false;
				}
			}
		} else {
			status1 = false;
		}
		if (status1 == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}

	}

}

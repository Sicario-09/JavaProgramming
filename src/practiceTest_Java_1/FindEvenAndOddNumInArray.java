package practiceTest_Java_1;

public class FindEvenAndOddNumInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		// Extracting Even numbers...........
//		System.out.println("Even num in array are......");
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 == 0) {
//				System.out.println(a[i]);
//			}
//		}
//
//		System.out.println("Even num in array are......");
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 != 0) {
//				System.out.println(a[i]);
//			}
//		}

		// By using Enhanced for loop

		System.out.println("Even num in array are......");
		for (int value : a) {
			if (value % 2 == 0)
				System.out.println(value);
		}

		System.out.println("Odd num in array are......");
		for (int value : a) {
			if (value % 2 != 0)
				System.out.println(value);
		}
	}
}

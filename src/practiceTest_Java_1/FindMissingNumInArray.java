package practiceTest_Java_1;

public class FindMissingNumInArray {

	public static void main(String[] args) {

		// 1. Array should not have duplicate.
		// 2. Array not need to be in sorted order(ascending or descending order).
		// 3. Values should be in range.

		int a[] = { 1, 2, 3, 5, 6 };
		// sum1 = 1+2+4+5=12
		// sum2 = 1+2+3+4+5=15
		// sum2-sum1 = 3 missing

		int sum1 = 0;

		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("The sum of elements in array is.... " + sum1);

		int sum2 = 0;

		for (int i = 1; i <= 6; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("The sum of elements in range is... " + sum2);

		System.out.println("The missing num is.... " + (sum2 - sum1));

	}

}

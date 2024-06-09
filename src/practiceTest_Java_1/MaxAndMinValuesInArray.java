package practiceTest_Java_1;

public class MaxAndMinValuesInArray {

	public static void main(String[] args) {

		int a[] = { 12, 15, 11, 20, 35 };

		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println("Maximum element in array is.... " + max);

		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println("Minimum element in array is.... " + min);

	}

}

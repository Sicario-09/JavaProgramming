package practiceTest_Java_1;

import java.util.Arrays;

public class BubbleSortInArray {

	public static void main(String[] args) {

		int num[] = { 4, 3, 1, 2, 5 };

		System.out.println("Arrays before sorting are.... " + Arrays.toString(num));

		int n = num.length;

		for (int i = 0; i < n - 1; i++) // num of passes
		{
			for (int j = 0; j < n - 1; j++) // Iterations in pass
			{
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}

		System.out.println("Arrays after sorting are.... " + Arrays.toString(num));

	}

}

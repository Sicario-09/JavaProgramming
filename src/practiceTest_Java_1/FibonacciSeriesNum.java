package practiceTest_Java_1;

public class FibonacciSeriesNum {

	// Fibonacci Series - A series of num in which each num (Fibonacci num) is the
	// sum of the two preceding numbers. e.g, 0 1 1 2 3 5 8 13 21 34....

	public static void main(String[] args) {

		int n1 = 0, n2 = 1, sum = 0;
		System.out.println(n1 + "  " + n2);

		for (int i = 2; i < 11; i++) {
			sum = n1 + n2; // sum = 0+1=1

			System.out.println("   " + sum); // 1 2 3 5 8 13 21 34 55

			n1 = n2;
			n2 = sum;
		}

	}

}

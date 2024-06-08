package practiceTest_Java_1;

public class SumOfDigitsInArray {

	public static void main(String[] args) {

		int a[] = { 5, 2, 3, 4, 1 };
		int sum = 0;

//		for(int i=0; i<=a.length-1; i++)
//		{
//			sum = sum + a[i] ;   // 5  5+2=7  7+3=10  10+4=14  14+1=15 
//		}

		// Enhanced for loop

		for (int value : a) {
			sum = sum + value;
		}

		System.out.println("The sum of digits in array is.... " + sum);
	}

}

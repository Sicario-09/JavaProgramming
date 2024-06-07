package practiceTest_Java_1;

public class FiveDiffWaysTwoSwapNum {

	public static void main(String[] args) {

		int a = 10, b = 20;

		System.out.println("Before Swapping the values are: " + a + "  " + b);

		// Logic 1 - Third variable

//		int t=a;
//		a=b;
//		b=t;

		// Logic 2 - using + & - operators

//		a=a+b;  // 10+20=30
//		b=a-b; // 30-20=10
//		a=a-b;  //30-10=20

		// Logic 3 - using * & / operators (a & b values should not be 0)

//		a=a*b;   // 10*20=200
//		b=a/b;   // 200/20=10
//		a=a/b;   // 200/10=20

		// Logic 4 - using bitwise XOR (^) operators

//		a = a ^ b; // 10^20=30
//		b = a ^ b; // 30^20=10
//		a = a ^ b; // 30^10=20

		// Logic 5 - Single Statement

		b = a + b - (a = b); // 20=10+20-(10=20)

		System.out.println("After Swapping the values are: " + a + "  " + b);

	}

}

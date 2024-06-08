package practiceTest_Java_1;

public class SumOfDigitsInANum {

	public static void main(String[] args) {

		int num = 23134;
		int sum = 0;

		while (num > 0) {
			sum = sum + num % 10; // 4 | 4+3 | 4+3+1 | 4+3+1+3 | 4+3+1+3+2 |

			num = num / 10; // 2313 | 231 | 23 | 2 | 0 |

		}

		System.out.println("The Sum of digits in a num is ....: " + sum);

	}

}

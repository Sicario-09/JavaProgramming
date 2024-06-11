package practiceTest_Java_1;

public class LinearSearchInArray {

	public static void main(String[] args) {

		int num[] = { 10, 20, 40, 20, 30, 50 };

		int search_ele = 50;
		boolean flag = false;

		for (int i = 0; i < num.length; i++) {
			if (search_ele == num[i]) {
				System.out.println("Element fount at.... " + i);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Element not found");
		}

	}

}

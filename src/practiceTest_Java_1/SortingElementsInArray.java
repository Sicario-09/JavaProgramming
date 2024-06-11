package practiceTest_Java_1;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementsInArray {

	public static void main(String[] args) {

		// Logic 1 - by using parallel sort method

		// int num[] = {10,20,50,30,60,40} ;

//		System.out.println("Arrays before sorting are.... " + Arrays.toString(num));
//		
//		Arrays.parallelSort(num);
//		
//		System.out.println("Arrays after sorting are.... " + Arrays.toString(num));

		// Logic 2 - by using sort method

//        System.out.println("Arrays before sorting are.... " + Arrays.toString(num));
//		
//		Arrays.sort(num);
//		
//		System.out.println("Arrays after sorting are.... " + Arrays.toString(num));

		// Logic 3 - by using decending order

		Integer num[] = { 10, 20, 50, 30, 60, 40 };

		System.out.println("Arrays before sorting are.... " + Arrays.toString(num));

		Arrays.sort(num, Collections.reverseOrder());

		System.out.println("Arrays after sorting are.... " + Arrays.toString(num));

	}

}

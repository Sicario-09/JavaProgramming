package practiceTest_Java_1;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumAndString {

	public static void main(String[] args) {
		
		// Logic 1 - by using Random class
		
//		Random rand = new Random();
//		int rand_num = rand.nextInt(100) ;                         // It will generate whole num in the range of 1-100
//		System.out.println("The random num is... "+rand_num) ;
//		
//		double decible_num = rand.nextDouble();          // It will generate num in the range of 0.0-1.0 upto 16 digits
//		System.out.println("The random num is... "+decible_num) ;
//		System.out.println(Math.random());              // It will generate num in the range of 0.0-1.0 upto 17 digits
		
		// Logic 2 - Apache commons-lang API
		
		String randnum = RandomStringUtils.randomNumeric(3) ;
		System.out.println("The num is.... "+randnum);
		
		String randStr = RandomStringUtils.randomAlphabetic(5) ;
		System.out.println("The num is.... "+randStr);

	}

}

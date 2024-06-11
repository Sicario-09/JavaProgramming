package practiceTest_Java_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {

		// Logic 1 - using FileReader BufferedReader

//		FileReader fr = new FileReader("C:\\Users\\Shree\\eclipse-workspace\\JavaProgramming\\Test.txt");
//		BufferedReader br = new BufferedReader(fr);
//		String str;
//		
//		while((str=br.readLine())!=null)
//		{
//			System.out.println(str);
//		}
//		br.close();

		// Logic 2 - using File & Scanner

		File file = new File("C:\\\\Users\\\\Shree\\\\eclipse-workspace\\\\JavaProgramming\\\\Test.txt");

		Scanner sc = new Scanner(file);

//		while (sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}
//		sc.close();

		// Logic 3

		sc.useDelimiter("\\z");
		System.out.println(sc.next());

	}

}

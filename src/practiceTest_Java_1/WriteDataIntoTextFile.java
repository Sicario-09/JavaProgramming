package practiceTest_Java_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\Shree\\eclipse-workspace\\JavaProgramming\\Test12.tx");
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("Selenium with Java");
		bw.write("Selenium with Python");

		System.out.println("Successfully Finished!!!!!!");
		bw.close();

	}

}

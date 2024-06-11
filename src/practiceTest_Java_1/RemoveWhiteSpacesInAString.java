package practiceTest_Java_1;

public class RemoveWhiteSpacesInAString {

	public static void main(String[] args) {

		String name = "Shubham is learning Java and Selenium";

		String str = name.replaceAll("\\s", "");

		System.out.println("After removing the white spaces.... " + str);

	}

}

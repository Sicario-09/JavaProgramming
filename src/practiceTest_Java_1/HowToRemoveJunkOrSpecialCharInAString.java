package practiceTest_Java_1;

public class HowToRemoveJunkOrSpecialCharInAString {

	public static void main(String[] args) {

		String name = "Shubha$m is very 7653423189 busy@#$%^&*";

		String nor_name = name.replaceAll("[^a-zA-Z]", "");

		System.out.println(nor_name);

	}

}

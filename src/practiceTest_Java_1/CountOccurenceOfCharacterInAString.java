package practiceTest_Java_1;

public class CountOccurenceOfCharacterInAString {

	public static void main(String[] args) {

		String str = "My name is Shubham";

		int total_count = str.length();

		int count_withoutm = str.replace("m", "").length();

		int count = total_count - count_withoutm;

		System.out.println("num occurence of m is... " + count);

	}

}

package practiceTest_Java_1;

public class ReverseEachWordInAString {

	public static void main(String[] args) {

//		String str = "Welcome to String in Java";   // original String
//
//		String words[] = str.split(" ");           // Splitting string into words
//
//		String reverse_str = "";
//
//		for (String w : words) {
//			String reverse_word = "";
//
//			for (int i = w.length() - 1; i >= 0; i--) {
//				reverse_word = reverse_word + w.charAt(i);
//			}
//
//			reverse_str = reverse_str + reverse_word + " ";
//		}
//
//		System.out.println("The revese word are.... " + reverse_str);

		// Logic 2 - using StringBuilder class

		String str = "Welcome to String in Java";

		String words[] = str.split("\\s");

		String reverse_word = "";

		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();

			reverse_word = reverse_word + sb.toString() + " ";
		}
		System.out.println("The revese word are.... " + reverse_word);

	}

}

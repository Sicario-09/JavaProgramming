package practiceTest_Java_1;

public class ThreeDiffWaysToReverseAString {

	public static void main(String[] args) {

		

		String str = "Shubham";
		String rev = " ";

		// Logic 1 - using +(String concatenation) operator
		
//		int len = str.length();           // 7
//		
//		for(int i=len-1; i>=0; i--)      // 6 5 4 3 2 1
//		{
//			rev = rev + str.charAt(i);   // m a h b u h S
//			
//		}
		
		
		// Logic 2 - using character array
		
//		char a[] = str.toCharArray();
//		int len = a.length;
//		
//		for(int i=len-1; i>=0; i--)        // 6 5 4 3 2 1
//		{
//			rev = rev + a[i];              // m a h b u h S
//		}
//		System.out.println("The reverse String is..."+ rev);
		
		// Logic 3 - using StringBuffer Class
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		

	}

}

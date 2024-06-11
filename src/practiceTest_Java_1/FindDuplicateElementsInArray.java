package practiceTest_Java_1;

import java.util.HashSet;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {

//		boolean nondupli = false;
//		
//		// Logic 1 - by using logic
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			for(int j=i+1; j<arr.length; j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					System.out.println("Found the duplicate Element.... "+arr[i]);
//					nondupli=true;
//				}
//			}
//		}
//		if(nondupli==false)
//		{
//			System.out.println("There is no duplicate string element in this array");
//		}

		// Logic 2 - by using HashSet collection

		String shubu[] = { "Java", "C", "C++", "Python", "C++", "Java" };
		boolean nondupli = false;

		HashSet<String> lang = new HashSet<String>();

		for (String l : shubu) {
			if (lang.add(l) == false) {
				System.out.println("The duplicate element is.... " + l);
				nondupli = true;
			}
		}
		if (nondupli == false) {
			System.out.println("There is no duplicate string element in this array");
		}

	}

}

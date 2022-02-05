package LeetCodeAlgorithms;

/**
 * @author Roohi Aisha
 *
 * Find if needle is part of haystack
 * 
 */
public class StrString {

	public static void main(String[] args) {
		
		String hayStack = "aishaTab";
		String needle = "Tab";
		
		int hl = hayStack.length();
		int nl = needle.length();
		
		
		
		for(int i=0 ; i< hl-nl+1 ; i++)
		{
			if(hayStack.substring(i, i+nl).equals(needle))
				System.out.println("The needle is part of haystack");
		}
	}

}

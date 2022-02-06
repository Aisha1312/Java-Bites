package LeetCodeAlgorithms;

/**
 * @author RoohiAisha
 *Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
public class ReverseWordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sample1 = "the sky is blue";
		System.out.println(reverseWords(sample1));
		String sample2 = "  hello world  ";
		System.out.println(reverseWords(sample2));
		String sample3 ="a good   example";
		System.out.println(reverseWords(sample3));
		

	}
	public static String reverseWords (String s){
	String s1 = s.trim();
    String nameWithProperSpacing = s1.replaceAll("\\s+", " ");
    String[] str = nameWithProperSpacing.split(" ");
    StringBuilder result = new StringBuilder();
    
    int left = 0;
    int right = str.length-1;
    
    while(left<right)
    {
        String temp = str[right];
        str[right] = str[left];
        str[left] = temp;
        right--;
        left++;
    }
    
    for(String a : str)
    {
        result = result.append(a).append(" ");
    }     
   return result.toString().trim(); 
}

}

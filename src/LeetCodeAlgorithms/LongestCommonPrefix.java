package LeetCodeAlgorithms;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs = {"flower","flow","flip"};
		
		String prefix = strs[0];
		
		for(int i=1; i<strs.length;i++)
		{
			while(strs[i].indexOf(prefix)!=0)
			{
				prefix = prefix.substring(0,prefix.length()-1);
			}
		}
		System.out.println("The string is "+ prefix);
	}

}

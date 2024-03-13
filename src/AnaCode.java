import java.util.HashMap;
import java.util.Map;

public class AnaCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("race","care"));
	}
	public static boolean isAnagram(String s1, String s2)
	{
		boolean flag;
		
		if(s1.length()==s2.length())
		{
			HashMap<Character,Integer> myMapS1 = new HashMap<Character,Integer>();
			HashMap<Character,Integer> myMapS2 = new HashMap<Character,Integer>();
			
			char ar1[] = s1.toCharArray();
			char ar2[] = s2.toCharArray();
			
			//First String s1
			for(int i=0;i<ar1.length;i++)
			{
				if(myMapS1.containsKey(ar1[i]))
					myMapS1.put(ar1[i], myMapS1.get(ar1[i])+1);
				else
					myMapS1.put(ar1[i], 1);
			}
			
			//First String s2
			for(int i=0;i<ar2.length;i++)
			{
				if(myMapS2.containsKey(ar2[i]))
					myMapS2.put(ar2[i], myMapS2.get(ar2[i])+1);
				else
					myMapS2.put(ar2[i], 1);
			}	
			
			if(myMapS1.equals(myMapS2))
				return true;
					
		}
		
		return false;
	}
}

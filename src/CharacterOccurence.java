import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharacterOccurence {

	public static void main(String[] args) {
			
		System.out.println(CharacterOccurence.charOccuranceMethodOne("Aisha is a good girl", 'a'));
		System.out.println(CharacterOccurence.charOccuranceMethodTwo("Aisha is a good girl", 'a'));
		
		//Storing in Hashmap
		String str = "My native is Chennai";
		char letter[] = str.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<Character,Integer>();
		for(char a: letter)
		{
			if(charMap.containsKey(a))
			{
				charMap.put(a, charMap.get(a)+1);
			}
			else
			{
				charMap.put(a, 1);
			}
		}
		
		//printing map
		Set<Map.Entry<Character,Integer>> entrySet = charMap.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
		
	}
	
	
	//Using for loop with length() and chatAt
	public static int charOccuranceMethodOne(String str, char a)
	{
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==a)
			{
				count++;
			}
		}
		
		return count;
	}

	
	//Using CharArray
	public static int charOccuranceMethodTwo(String str, char a)
	{
		int count = 0;
		for(char c : str.toCharArray())
		{
			if(a==c)
			{
				count++;
			}
		}
		return count;
	}
	
	//Using Streams
	public static void getCharCountUsingStreams(String s, char val)
	{
		long count = s.chars()
						.mapToObj(e->String.valueOf((char)e))
						.filter(e->e.equals(val))
						.count();
		System.out.println(count);
	}
	
	//Using HashMap
	


}

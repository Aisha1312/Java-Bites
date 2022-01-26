import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		duplicateCharacters("I am living in Chennai and love travelling");
		duplicateCharacters("");
		duplicateCharacters(null);
		duplicateCharacters("a");
	}

	public static void duplicateCharacters(String str) {
		
		if(str==null)
		{
			System.out.println("String is null");
			return;
		}
		if(str.length()==1)
		{
			System.out.println("String contains a single letter");
			return;
		}
		if(str.isEmpty())
		{
			System.out.println("String is empty");
			return;
		}
		char letter[] = str.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char c : letter) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		
		//printing character array
		Set<Map.Entry<Character,Integer>> entrySet = charMap.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey() + ":" +entry.getValue());
			}
		}
	}

}

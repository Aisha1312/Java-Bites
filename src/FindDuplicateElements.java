import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author RoohiAisha
 *
 */
public class FindDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String infra[] = {"Amazon" ,"GCP", "Azure", "Amazon","Ali Baba", "SauceLabs","GCP"};
		
		//1.BruteForce
		//2.HashSet
		//3.HashMap<K,V>
		//4.Streams
		
		System.out.println("---------Brute Force----------");
		for(int i=0;i<infra.length;i++)
		{
			for(int j= i+1; j<infra.length;j++)
			{
				if(infra[i].equals(infra[j]))
				{
					System.out.println(infra[i]);
				}
			}
		}
		
		System.out.println("---------HashSet----------");
		Set<String> data = new HashSet<String>();
		for(String s : infra)
		{
			if(data.add(s)==false)
			{
				System.out.println(s);
			}
		}
		
		System.out.println("---------Hash Map----------");
		Map<String, Integer> infraMap = new HashMap<String, Integer>();
		
		for(String e : infra)
		{
			if(infraMap.containsKey(e))
			{
				infraMap.put(e, infraMap.get(e)+1);
			}
			else
				infraMap.put(e,1);
		}
		//iterating over Map
		Set<Map.Entry<String,Integer>> myMap = infraMap.entrySet();
		for(Map.Entry<String,Integer> e: myMap)
		{
			if(e.getValue()>1)
				System.out.println(e.getKey() + " " + e.getValue());
		}
		
		System.out.println("---------Streams----------");
		Set<String> dataSet = new HashSet<String>();
		Set<String> dupSet =
							Arrays.asList(infra)
							.stream()
							.filter(e -> !dataSet.add(e)).collect(Collectors.toSet());
							System.out.println(dupSet);
		
	}

}

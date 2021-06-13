import java.util.Arrays;
import java.util.stream.Stream;

import com.google.common.primitives.Ints;

public class JoiningArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] firstName = {"Aisha", "Roohi", "Farhana", "Fardeen"};
		String[] lastName = {"Tabassum", "Kauser", "Tabassum" , "Khan"};
		
		//Using Java 8
		Stream<String> sfirstName = Arrays.stream(firstName);
		Stream<String> slastName = Arrays.stream(lastName);
		
		String fullName[] = Stream.concat(sfirstName,slastName).toArray(size->new String[size]);
		
		for(String s:fullName)
		{
			System.out.println(s);
		}
		
		//Google Gauva Library
		int p1[] = {1,2,3,4};
		int p2[] = {5,6,7,8};
		
		int p3[] = Ints.concat(p1,p2);
	

	}
}

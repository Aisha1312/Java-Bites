import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Roohi Aisha
 *input - "Aisha"
 *output - 5
 */
public class FindingStringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Aisha";
		System.out.println(str.toCharArray().length);
		
		System.out.println(str.lastIndexOf(""));
		
		System.out.println(str.split("").length);
		
		//using matcher
		Matcher m = Pattern.compile("$").matcher(str);
		m.find();
		int len = m.end();
		System.out.println(len);
		
		//using for loop
		int c=0;
		for(char ch : str.toCharArray())
		{
			c++;
		}
		System.out.println("The length of string is  " + c);
		
		//Using Method
		System.out.println("The length of string is by method is" + getLength(str));
		

	}
	
	
	public static int getLength(String s)
	{
		int i=0;
		try{
			while(true)
			{
				s.charAt(i);
				i++;
			}
		}
		catch(IndexOutOfBoundsException e)
		{
			return i;
			
		}
		
	}

}

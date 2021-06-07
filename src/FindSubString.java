import java.util.Scanner;

/**
 * @author Roohi Aisha
 * Ip--AishaTabassum
 * Ip--Aisha
 * Op- Aisha
 *
 */
public class FindSubString {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\r?\n");
		
		System.out.println("Enter the main long String");
		String mainString = sc.next();
		
		System.out.println("Enter the sub String");
		String subString = sc.next();
		
		System.out.println(isSubstring1(mainString,subString));
		System.out.println(isSubstring2(mainString,subString));
		System.out.println(isSubstring3(mainString,subString));
		
		
		//logic to compare two strings irrespective of Lower case or upper case
		String mainStringUpper = mainString.toUpperCase();
		String subStringUpper = subString.toUpperCase();
		
		int i=0;
		int j=0;
		
		System.out.println("Comparing irrespective if lower case and upper case  " + mainStringUpper.contains(subStringUpper));
		
		//logic without using any string methods
		for(i=0;i<subStringUpper.length();i++)
		{
			for(j=0;j<mainStringUpper.length();j++)
			{
				if(subStringUpper.charAt(i)==mainStringUpper.charAt(j))
						break;
			}
			if(j==(mainStringUpper.length()-1))
			{
				System.out.println("The sub-string is not present");
			}else {
				System.out.println("The sub-string is present");
			}		
		}
		
	}
	
	public static boolean isSubstring1(String mainS, String subS)
	{
		
		return mainS.matches((".*")+subS+(".*"));
		
	}
	public static boolean isSubstring2(String mainS, String subS)
	{
		
		return mainS.contains(subS);
		
	}
	public static boolean isSubstring3(String mainS, String subS)
	{
		
		return mainS.indexOf(subS)!=-1;
		
	}


}

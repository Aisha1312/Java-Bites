import java.util.Scanner;

public class FindSubstring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\r\n");
		System.out.println("Entering the main string");
		String main = sc.next();
		System.out.println("Entering the substring");
		String sub = sc.next();
		
		int j=0;
		if(main.length()>=sub.length())
		{
			
			for(int i =0 ; i<sub.length();i++)
			{
				for(;j<main.length();j++)
				{
					if(sub.charAt(i)==main.charAt(j))
					{
						break;
					}
				}
			}
			if(j<main.length())
			{
				System.out.println("String is present");
			}
			if(j==main.length())
			{
				System.out.println("String not present");
					
			}
				
		}
		else
		{
			System.out.println("Invalid Input");
		}

	}

}

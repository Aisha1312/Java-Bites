import java.util.*;
/**
 * @author Roohi Aisha
 * IP--aaaabbbcc
 * OP--4a3b2c
 *
 */
public class RunLengthEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//taking the 
		System.out.println("Enter the String");
		String input= sc.next();
		
		char[] inputArray= input.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		int counter=0;
		char prevChar=0;
		
		for(char c:inputArray)
		{
			if(c==prevChar)
			{
				++counter;
			}
			else
			{
				if(prevChar!=0)
				{
					sb.append(counter).append(prevChar);			
				}
				
				prevChar=c;
				counter=1;
			}
		}
		sb.append(counter).append(prevChar);
		System.out.println("The strong is "+ sb.toString());
	}

}

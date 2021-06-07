import java.util.Scanner;

/**
 * @author Roohi Aisha
 * IP-4a3b2c
 * OP-aaaabbbcc
 */
public class RunLengthDecoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Enter the input string
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		//char[] inputArray = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		int n;
		
		if(input==null||input.length()==0)
		{
			throw new NullPointerException();
		}
		//Iterating over an array
		
		for (int i=0;i<input.length();i++)
		{
			
			if(Character.isDigit(input.charAt(i)))
			{
				char s= input.charAt(i);
				String j= Character.toString(s);
				n = Integer.parseInt(j);
				
				System.out.println("The count is  " +n);
				
				for(int k=n; k>=1; k--)
				{
					sb.append(input.charAt(i+1));
				}
				
			}
			
			i++;
		}
		
		System.out.println(sb);
		

	}

}

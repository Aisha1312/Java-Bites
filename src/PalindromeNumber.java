import java.util.Scanner;

public class PalindromeNumber {
	
	public static boolean isPalindrome(int num)
	{
		int rev =0;
		int t=num;
		
		while(num>0)
		{
			rev = (rev*10)+ (num%10);
			num = num/10;
		}
		System.out.println(rev);
		if(rev==t)
		{
			return true;
		}
		else
			return false;
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		String s;
		int n= sc.nextInt();
		s = Integer.toString(n);
		boolean b = isPalindrome(n);
		System.out.println(b);
		System.out.println("----------Using String Buffer-------------");
		StringBuffer sb = new StringBuffer(Integer.toString(n));
		StringBuffer ss = sb.reverse();
		
		if(s.contentEquals(ss))
		{
			System.out.println("the string is palindrome");
		}
		else
		{
			System.out.println("String is not a palindrome");
		}
		
		
	}

}

import java.util.Scanner;

public class ReverseANumber {

	/**
	 * Code to reverse a number without % operator
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		
		String b =null;
		
		System.out.println(s);
		StringBuffer c = new StringBuffer(s);
		c.reverse();
		System.out.println(c);
		
		
		System.out.println("******using algorithm*********");
		
		long l = Long.parseLong(s);
		long rev = 0;
		
		while(l!=0)
		{
			rev = (rev*10) +(l%10);
			l = l/10;
		}
		
		System.out.println(rev);

	}

}

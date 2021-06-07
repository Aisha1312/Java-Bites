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
		

	}

}

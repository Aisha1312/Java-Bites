package LeetCodeAlgorithms;

/**
 * @author Roohi Aisha
 *  Add two binary numbers and give the result in binary
 *
 */
public class AddBinary {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		String a = "1010";
		String b = "1000";
		int i = a.length()-1;
		int j = b.length()-1;
		
		int carry=0;
		
		while(i>=0||j>=0)
		{
			int sum = carry;
			
			if(i>=0)
				sum += a.charAt(i--)-'0';
			if(j>=0)
				sum += b.charAt(j--)-'0';
			
			sb.append(sum%2);
			carry = sum/2;
		}
		if(carry>0) sb.append(carry);
		
	System.out.println( sb.reverse().toString());
	}
}

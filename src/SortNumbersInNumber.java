import java.util.Arrays;
import java.util.Scanner;

/**
 * Sorting Numbers in number eg 12384756,
 * op - 12345678
 *
 */
public class SortNumbersInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int  a = sc.nextInt();
		
		int len = Integer.toString(a).length();
		int[] ar = new int[len];
		
		for(int i=0;i<len;i++)
		{
			ar[i] = a%10;
			a=a/10;
			
		}
		
		Arrays.sort(ar);
		int num =0;
		for (int i=0;i<len;i++)
		{
			num = (num*10)+ar[i];
		}
		
		System.out.println(num);
		
	}

}

package LeetCodeAlgorithms;
import java.util.Scanner;


/**
 * @author Roohi Aisha
 * Input -10 -7 0 2 3   output - 0 4 9 49 100 
 */
public class SortedSquareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements in array");
		Scanner sc = new Scanner(System.in);
		//sc.useDelimiter("\n\r");
		
		int number = sc.nextInt();
		int[] input = new int[number];
		int[] output = new int[number];
		System.out.println("Enter elements one by one");
		for(int g =0; g<input.length;g++)
		{
			input[g] = sc.nextInt();
		}
		
		int i =0;
		int j = number-1;
		int k=j;
		
		while(i<=j)
		{
			int num;
			if(Math.abs(input[i])>Math.abs(input[j]))
			{
				num = input[i];
				i++;	
			}
			else
			{
				num = input[j];
				j--;
			}
			output[k] = num*num;
			k--;	
		}
		//printing array
		for(int b : output)
		{
			System.out.println( b + " ");
		}
		

	}

}

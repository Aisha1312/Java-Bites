import java.util.Arrays;

//Replace with the largest number to its right
//A = [1,2,10,7,1,9]
//Result = [10,10,9,9,9,-1]
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {1,2,10,7,1,9};
		int[] result = new int[A.length];
		
		for(int i=0; i<= A.length-1;i++)
		{
			int temp;
			int max_value = Integer.MIN_VALUE;
			for(int j=i+1; j<A.length;j++)
			{
				if(A[j] > max_value)
				{
					temp = A[j];
					max_value = A[j];
				}
				result[i] = max_value;	
			}
		}
		result[A.length-1] = -1;
		
		for(int s : result)
		{System.out.println(s);}

	}
}

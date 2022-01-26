import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Roohi Aisha
 *
 *A = [1,2,3]
 *B = [2,2,3]
 *C = [3,3,3]
*
*- any programming language
*Using the list above, how will you obtain this output. Without using sort/sorted function
*D = [1,2,2,2,3,3,3,3,3]
*/
public class MergeAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {1,2,3};
		int[] B = {2,2,3};
		int[] C = {3,3,3};
			
		int len = A.length +B.length + C.length;
		
		Integer[] D = new Integer[len];
		char[] ar = new char[3];
		int j=0;
		int k=0;
		for(k=0;k<A.length;k++)
		{
			D[k]=A[k];
		}
		j=k;
		for(k=0;k<B.length;k++)
		{
			D[j] = B[k];
			j++;
		}		
		for(k=0;k<B.length;k++)
		{
			D[j] = C[k];
			j++;
		}
		System.out.println("The Merged array is ----");
		for(int l=0;l<D.length;l++)
		{
			System.out.println(D[l]);
		}
		
		for(int m=0;m<D.length;m++)
		{
			for(int n =m+1;n<D.length;n++)
			{
				if(D[m]>D[n])
				{
					D[m] = D[m] + D[n];
					D[n] = D[m] - D[n];
					D[m] = D[m] -D[n];
				}
				
			}
		}
		System.out.println("The sorted array is ----");
		for(int l=0;l<D.length;l++)
		{
			System.out.println(D[l]);
		}
		
		
	}

}


/**
 * @author Roohi Aisha
 * IP  {1,2,3,4,5,6}
 * OP {3,0,0,0,0,0} Finding elements that divide sum of all the other elements
 */
public class CountDivideElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6};
		int s = a.length;
		
		int b[] = new int [s];
		int k= 0;
		
		for (int i = 0; i<s ; i++)
		{
			int sum = 0;
			for(int j=0; j<s ;j++)
			{
				if(i==j)
				{
					
				}
				else
					sum = a[j]+sum;
				
			}
			if(sum % a[i] == 0)
			{
				b[k] = a[i];
			}
		}
		for(int l=0; l<s; l++)
		{
			System.out.println(b[l]);
		}
		
	}

}


/**
 * @author Roohi Aisha
 * IP  {3, 9, 4, 6, 7, 5 }
 * OP 	{9,6,7}
 */
public class GreaterThanRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {3, 9, 4, 6, 7, 5 };
		int size = a.length;
		
		int b[] = new int[size];
		int k = 0;
		for(int i= 0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(a[i]>a[j])
				{
					b[k] = a[i];
					k++;
					break;
				}
			}
		}
		
		for(int f : b)
		{
			System.out.println(f);
		}

	}

}

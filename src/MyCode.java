///CyclicArray

/**
 * @author DELL
 * 
 * Given two input String A and B. Return True if B is a Substring of A. provided A is a circular String
Eg.1: A="qwerty" and B="erty" output = true
Eg.2: A= "qwerty" and B="rtyq" output = true
Eg.3: A= "qwerty" and B="rtyw" output = false
 *
 */
public class MyCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isSubString("qwerty","erty"));

	}
	
	public static boolean isSubString(String A, String B){

		char arrA[] = A.toCharArray();
		char arrB[] = B.toCharArray();
		
		int lenA = A.length();
		int lenB = B.length();
		
		if(lenA>=lenB)
		{
		
			for(int i=0; i<=lenA-lenB; i++)
			{
				for(int j=0; j<lenB; j++)
				{
					if(arrA[j]!=arrB[j])
					{	
						if(arrA[j%lenA] == arrB[j])
							continue;
						else
							{break;}
					}
					else
					{
						continue;
					}
				}
				
			}
		}
		
		else 
			return false;
		
	
	}

}

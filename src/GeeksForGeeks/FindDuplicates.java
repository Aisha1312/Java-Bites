package GeeksForGeeks;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> myList = new ArrayList<Integer>();
		 int[] a = {2,3,1,2,3};
		 myList = duplicates(a, 5);
		 
		 System.out.println(myList);
	}
	
	public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> ar = new ArrayList<Integer>();
        
        int j=0;
        int i=0;
        for(i=0;i<n;i++)
        {
            j=i+1;
            
            while(i<n && j<n)
            {
                if(arr[i]==arr[j])
                   {
                       if(!ar.contains(arr[i]))
                             ar.add(arr[i]);
                   }
                    j++;
            }
        }
        
        if(ar.size()==0)
            {
                ar.add(-1);
                return ar;
            }
        else 
            return ar;
    }

}

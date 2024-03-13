import java.util.ArrayList;
import java.util.List;

/**
 * @author RoohiAisha
 *
 */
public class FindingMinInArray {
	
	 public static void miniInArray(List<Long> arr) {
		    // Write your code here
		        long min= Integer.MAX_VALUE;
		        long resultMin=0;
		        for(Long i: arr)
		        {
		             min = (min < i) ? min : i;     
		        }
		        System.out.println(min);
		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Long> arr = new ArrayList<Long>();
		arr.add((long) 1);
		arr.add((long) 2);
		arr.add((long) 3);
		arr.add((long) 4);
		miniInArray(arr);
	}
}

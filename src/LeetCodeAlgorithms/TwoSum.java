package LeetCodeAlgorithms;

/**
 * @author RoohiAisha
 *Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 */
public class TwoSum {
	
public static int[] twoSum(int[] numbers, int target) {
        
        int left = 0;
        int right= numbers.length-1;
        int[] result = new int[2];
        
        while(left<right)
        {
            int l=numbers[left];
            int r= numbers[right];
            
            if(l+r==target)
            {
               result[0]=left+1;
               result[1] = right+1;
                break;
            }
            else if(l+r<target)
                left++;
            else
                right--;
        }
        return result;     
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {2,7,11,15};
		int[] result = new int[2];
		result = twoSum(ar,9);
		
		for(int a:result)
		{
			System.out.println(a);
		}
	}

}

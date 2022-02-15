package LeetCodeAlgorithms;

import java.util.HashSet;

/**
 * @author Roohi Aisha
 * 
 * Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 *
 */
public class IntersectionOfTwoArrays {
	
	    public static int[] intersection(int[] nums1, int[] nums2) {
	         HashSet<Integer> set1 = new HashSet<Integer>();
	    for (Integer n : nums1) set1.add(n);
	    HashSet<Integer> set2 = new HashSet<Integer>();
	    for (Integer n : nums2) set2.add(n);

	    set1.retainAll(set2);

	    int [] output = new int[set1.size()];
	    int idx = 0;
	    for(int s : set1) output[idx++] = s;
	    return output;
	                
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2,2,1};
		int[] arr2 = {2,2};
		int[] result = intersection(arr1,arr2);
		
		System.out.println("The result is ");
		
		for(int b : result)
		{
			System.out.print(b + " ");
		}

	}

}

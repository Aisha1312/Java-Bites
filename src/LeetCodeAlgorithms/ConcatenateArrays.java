package LeetCodeAlgorithms;

public class ConcatenateArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1};
		int ansLength = nums.length*2;
        int[] ans = new int[ansLength];
        int n=0;

        for(int i=0; i < ansLength; i++)
        {
            ans[i]=nums[n];
            n++;
            if(n==nums.length)
            {
                n=0;
            }
        }
       
        for(int ansVal : ans)
		{
			System.out.print(ansVal + " ");
		}
  

	}

}

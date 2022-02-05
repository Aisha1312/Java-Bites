package LeetCodeAlgorithms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] ar = {'h','e','l','l','o'};

		int i =0;
		int j = ar.length -1;
		
		while(i<j)
		{
			char temp = ar[i];
			ar[i]=ar[j];
			ar[j] = temp;
			i++;
			j--;
		}
		
		for(char c : ar)
		{
			System.out.println(c);
		}
	}

}

package GeeksForGeeks;

import java.util.Scanner;

public class EquilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int equilibriumpoint = equilibriumpoint(arr,n);
		System.out.println("The result of equilibrium is " + equilibriumpoint);
	}
	
	public static int equilibriumpoint(int[] arr, int n)
	{
		if (arr.length == 0) {
			return -1;
		}
		if (arr.length == 1) {
			return 1;
		}
		int sum = 0;
		int lSum = 0;
		int rSum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		lSum = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			rSum = sum - arr[i] - lSum;
			if (lSum == rSum) {
				return i + 1;
			} else {
				lSum += arr[i];
			}
		}
		return -1;
	}

}

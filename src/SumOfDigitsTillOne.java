import java.util.Scanner;

public class SumOfDigitsTillOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lastSum =0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		lastSum = oneDigit(n);
		System.out.println("The sum is" + lastSum );
	}
	public static int oneDigit(int n) {
		int grSum = 0;
		do
		{
			grSum = digit(n);
			while(grSum >= 10)
			{
				grSum = digit(grSum);
				if(grSum<10)
					break;
			}
		}while(grSum==0);
		return grSum;
	}
	
	public static int digit(int n)
	{	
		int tempSum = 0;
		while(n!=0)
		{
			if((n%10)!=0) {
				tempSum = tempSum + n%10;
				n = n/10;
			}
			else
				{
					tempSum=1;
					break;
				}
		}
		return tempSum;
	}	
}

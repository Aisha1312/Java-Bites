import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean result;
		result = isArmstrong(n);
		System.out.println("the number is armstrong "+result);
		
	}
	
	public static boolean isArmstrong(int m)
	{
		int t;
		t= m;
		int arm = 0;
		
		while(t>0)
		{
			int temp = t%10;
			arm = arm + (temp*temp*temp); 
			t= t/10;
		}
		System.out.println(arm);
		
		if(arm ==m)
		{
			return true;
		}
		else
			return false;
		
	}

}

import java.util.Scanner;

/**
 * @author Roohi Aisha
 * This code will count the number of words present in capitalized string
 * Ip--WelcomeToAishaGitRepository
 * Op--5
 * 
 */
public class CountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String S = sc.next();
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		System.out.println("Method using Character class");
		for(int i=0;i<S.length();i++)
		{

			if(Character.isUpperCase(S.charAt(i)))
			{
				++count1;
			}
		}
		System.out.println("Number of words in String " + count1);	
		
		System.out.println("Method using 'A' to 'Z'");
		for(int i=0;i<S.length();i++)
		{
			if(S.charAt(i)>='A'&&S.charAt(i)<='Z')
			{
				++count2;
			}
		}
		System.out.println("Number of words in String " + count2);
		
		System.out.println("Method using ASCII numbers");
		for(int i=0;i<S.length();i++)
		{
			if(S.charAt(i)>=65 &&S.charAt(i)<= 90)
			{
				++count3;
			}
		}
		System.out.println("Number of words in String " + count3);
		
	}

}

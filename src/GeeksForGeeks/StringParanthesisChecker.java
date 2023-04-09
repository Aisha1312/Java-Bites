package GeeksForGeeks;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author RoohiAisha
 * 
 * {{}}{}{} - balanced
 * {}{}} - nonBalanced
 */
public class StringParanthesisChecker {
	
	public static void main(String[] args)
	{
		StringParanthesisChecker pc = new StringParanthesisChecker();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println( pc.checkBalanceParanthesis(s) ? "balanced" : "nonBalanced");
		
	}

	private boolean checkBalanceParanthesis(String s) {
		// TODO Auto-generated method stub
		
		Stack<Character> st = new Stack<>();
		char[] sArr = s.toCharArray();
		
		for(int i =0; i<sArr.length; i++)
		{
			if(st.empty())
				st.push(sArr[i]);
			else {
					if(sArr[i]==')' && st.peek()=='(')
						st.pop();
					else if(sArr[i]=='}' && st.peek()=='{')
						st.pop();
					else if(sArr[i]==']' && st.peek()=='[')
						st.pop();
					else if(sArr[i]==')'||sArr[i]=='('||sArr[i]=='}'||sArr[i]=='{'||sArr[i]==']'||sArr[i]=='[')
						st.push(sArr[i]);
				}		
		}
		return st.empty();
	}

}

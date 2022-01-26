package LeetCodeAlgorithms;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the sentence to be reversed");
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\r\n");
		
		String ip = sc.next();
		String op = reverse(ip);
		System.out.println("The reversed string is - " + op);

	}
	
	public static String reverse(String ip)
	{
		StringBuilder op = new StringBuilder();
		String[] ar = ip.split(" ");
		for(String a : ar)
		{
			String revWord = wordReverse(a);
			op.append(revWord).append(" ");	
		}
		System.out.println(op);
		return op.toString();	
	}
	
	public static String wordReverse(String b)
	{
		char[] c = b.toCharArray();
		int i=0;
		int j=c.length-1;
		while(i<j)
		{
			char temp = c[i];
			c[i++] = c[j];
			c[j--] = temp;
		}
		return new String(c);
	}
}

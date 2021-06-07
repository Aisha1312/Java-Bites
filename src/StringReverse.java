
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Aisha";
		String b = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			b=b+s.charAt(i);
		}
		
		System.out.println(b);

	}

}

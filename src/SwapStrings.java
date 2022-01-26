
public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Aisha";
		String s2 = "Tabassum";
		
		System.out.println("The strings before swapping is " + s1 + s2);
		
		s1 = s1+s2;
		
		s2 = s1.substring(0, s1.length()-s2.length());
		
		s1 = s1.substring(s2.length());
		
		System.out.println("The strings before swapping is " + s1 + s2);

	}

}

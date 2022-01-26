
public class RemoveJunkCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "&*()^My Name is Aisha^%&*";

		//Using regEx
		
		s  = s.replaceAll("[^a-zA-Z ]","");
		
		System.out.println(s);
		
	}

}

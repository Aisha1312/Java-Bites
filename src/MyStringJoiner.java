import java.util.StringJoiner;

/**
 * @author Roohi Aisha
 * Joining strings 
 */
public class MyStringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner sj = new StringJoiner(":", "\"", "\"");
		
		sj.add("Aisha").add("Roohi").add("Kauser");
		System.out.println(sj.toString());
	

	}

}

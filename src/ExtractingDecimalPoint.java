
/**
 * @author Roohi Aisha
 * code to separate integers from decimal numbers
 *
 */
public class ExtractingDecimalPoint {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double doubleNumber=24.004;
		String doubleAsString= String.valueOf(doubleNumber);
	
		
		int index = doubleAsString.indexOf(".");
		
		System.out.println("Integer part is " + doubleAsString.substring(0, index));
		System.out.println("decimal part is " + doubleAsString.substring(index));
		

	}

}

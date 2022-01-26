
public class SwapIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y = 5;
		
		int a=10;
		int b = 5;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println(" x : "+ x + " y : "+ y );

		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println(" a : "+ a + " b : "+ b );

	}

}

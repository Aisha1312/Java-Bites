
public class ExceptionsExercise {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try{
			int a = 5/0;
		}
		
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			
		}
		catch(Exception e)
		{
			
			e.getStackTrace();
		}

		

	}

}

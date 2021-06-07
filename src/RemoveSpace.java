
public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Aisha Tabassum";
		String b = "";
		
		//Using String functions
		/* b= s.replaceAll(" ","");
		System.out.println(b);*/
		
		
		//Using steps
		for (int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==' ')
			{
				
			}
			
			else{
				b=b+s.charAt(i);
			}
		}
		System.out.println(b);
	}

}

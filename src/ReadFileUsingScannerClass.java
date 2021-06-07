import java.io.File;
import java.util.Scanner;

/**
 * @author Roohi Aisha
 *Reading file using scanner class
 *
 */
public class ReadFileUsingScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "E:\\Aisha Personal\\Node Learning\\New Text Document.txt";
		 Scanner sc = null;
		try {
			 File file = new File(path);
			 sc = new Scanner(file);
			 
			 System.out.println("File Content is ");
			 
			 while(sc.hasNext())
			 {
				 System.out.print(sc.next());
			 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			sc.close();
			
		}

	}

}

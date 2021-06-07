import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Roohi Aisha
 *Used to read file using file Input stream
 */
public class ReadFileUsingFileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "E:\\Aisha Personal\\Node Learning\\New Text Document.txt";
		FileInputStream fip = null;
		try {
			File file = new File(filePath);
			fip = new FileInputStream(file);
			 int c=0;
			 
			 while((c=fip.read())!=-1)
			 {
				 System.out.print((char)c);
			 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try {
				fip.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}

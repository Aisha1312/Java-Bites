import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {

	public static void main(String[] args) {
		
		String path = "E:\\Aisha Personal\\Node Learning\\New Text Document.txt";
		FileReader fr = null;
		try {
			fr = new FileReader(path);
			System.out.println("File Content is : " );
			
			int c= 0;
			while((c=fr.read()) != -1)
			{
				System.out.print((char) c);
			}		
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fr.close();
			}
			catch(IOException e )
			{
				e.printStackTrace();
			}
		}

	}

}

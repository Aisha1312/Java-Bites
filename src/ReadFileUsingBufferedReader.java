import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Roohi Aisha
 * Read file using buffered file reader
 */
public class ReadFileUsingBufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "E:\\Aisha Personal\\Node Learning\\New Text Document.txt";
		BufferedReader br = null;
		File file = new File(path);
		
		try {
			 br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int c=0;
		try {
			while((c=br.read()) != -1)
			{
				System.out.print((char) c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

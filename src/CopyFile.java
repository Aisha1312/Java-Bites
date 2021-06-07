import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	
	public static void main(String args[])
	{
		copyFile();
		
	}
	public static void copyFile()
	{
		File inFile = new File("resources/resume21.pdf");
		File outFile = new File("resources/out.pdf");
		
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		
		try {
			fileInputStream = new FileInputStream(inFile);
			fileOutputStream = new FileOutputStream(outFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(fileInputStream.available());
		} catch(IOException e)
		{
			e.printStackTrace();
		}
		
		int i=0;
		try {
			while((i= fileInputStream.read()) !=-1)
			{
				fileOutputStream.write(i);
			}
		}
		catch(IOException e )
		{
			e.printStackTrace();
		}
		finally {
			//Close stream
			if(fileInputStream != null)
			{
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(fileOutputStream != null)
			{
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}

import java.awt.Desktop;
import java.io.File;

/**
 * @author Roohi Aisha
 * File Reader 
 * Buffered Reader
 * File Input Stream
 */
public class FileHandlingUsingDesktop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---Open and read a file in java---Launching a file in desktop");
		String filePath="E:\\Aisha Personal\\Node Learning\\New Text Document.txt";
		
		try {
			File file = new File(filePath);
			if(!Desktop.isDesktopSupported())
			{
				System.out.println("Desktop not supported");
				return;
			}
			Desktop desktop = Desktop.getDesktop();
			
			if(file.exists())
			{
				desktop.open(file);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

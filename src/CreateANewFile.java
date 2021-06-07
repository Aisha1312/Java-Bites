import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author Roohi Aisha
 * creating a new file
 *
 */
public class CreateANewFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1. Using File
		File file = new File("E:\\Aisha Personal\\Node Learning\\test.txt");
		
		try {
			boolean flag = file.createNewFile();
			if(flag)	
				{
					System.out.println(flag);
				}
			else
				System.out.println("File is already present");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//2.FileOutputStream along with Scanner
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter file name with location path: ");
			String filePath = sc.nextLine();
			
			FileOutputStream fos = new FileOutputStream(filePath, true);
			
			System.out.println("Enter the file content: ");
			
			String content = sc.nextLine();
			
			byte b[] = content.getBytes();
			fos.write(b);
			fos.close();
			
			System.out.println("File Saved on given location path");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("------------------------------------------");
		//3.Java nio package
		try {
			Path pathLocation=
					Paths.get("E:\\Aisha Personal\\lulu.txt");
			Path newPathLocation = Files.createFile(pathLocation);
			System.out.println(newPathLocation);
		}
		catch(Exception e)
		{
			System.out.println("exception occured");
			e.printStackTrace();
		}
	
	}

}

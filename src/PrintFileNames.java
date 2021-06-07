import java.io.File;
import java.util.Arrays;

/**
 * @author Roohi Aisha
 * 
 * Printing file names in folder 
 * Printing names of directory
 *
 */
public class PrintFileNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "E:\\Aisha Personal";
		File file = new File(filePath);
		
		File aishaPersonal[] = file.listFiles();
		
		Arrays.sort(aishaPersonal);
		
		for(File i : aishaPersonal)
		{
			if(i.isFile())
				System.out.println("The Name of file is "+ i.getName());
			else if (i.isDirectory())
			{
				System.out.println("The Name of directory is " + i.getName());
			}
			else {
				System.out.println("Not Known " + i.getName());
			}
		}
	}

}

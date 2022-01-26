import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

/**
 * @author Roohi Aisha
 *
 */
public class PNGToJPGConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//URL url = new URL("https://www.tripodeal.com/img/travelsees_logo.png");
			File file = new File("E:\\beautiful_natural_scenery_04_hd_pictures_166229.jpg");
			BufferedImage image = ImageIO.read(file);
			ImageIO.write(image, "bmp", new File("E:\\trip.bmp"));
			ImageIO.write(image, "gif", new File("E:\\trip.gif"));
			ImageIO.write(image, "png", new File("E:\\trip.png"));
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

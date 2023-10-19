import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class PictureExercise {

 public static void main(String[] args) {
  try {
   File f = new File("scenery.jpg");
   BufferedImage image = ImageIO.read(f);
   int height = image.getHeight();
   int width = image.getWidth();
   System.out.println("Height : " + height);
   System.out.println("Width : " + width);
  } catch (IOException ioe) {
   ioe.printStackTrace();
  }
 }
}

// int name = function ----> print the function using the name
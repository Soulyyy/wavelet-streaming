import java.io.File;

import objects.RGBImage;
import utils.BmpReader;

public class Main {

  public static void main(String[] args) {
    System.out.println("hello, world!");
    RGBImage image = BmpReader.read(new File(""));
    System.out.println(image.getRedChannel().toString());
  }
}

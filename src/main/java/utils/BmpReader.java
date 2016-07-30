package utils;

import java.io.File;

import objects.RGBImage;

public class BmpReader {

  public static RGBImage read(File file) {
    return new RGBImage(255, 255);
  }
}

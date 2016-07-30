package objects;

public class RGBImage {

  private ColorChannel redChannel;
  private ColorChannel greenChannel;
  private ColorChannel blueChannel;

  public RGBImage(int width, int height) {
    this.redChannel = new ColorChannel(width, height);
    this.greenChannel = new ColorChannel(width, height);
    this.blueChannel = new ColorChannel(width, height);
  }

  public ColorChannel getRedChannel() {
    return redChannel;
  }

  public ColorChannel getGreenChannel() {
    return greenChannel;
  }

  public ColorChannel getBlueChannel() {
    return blueChannel;
  }
}

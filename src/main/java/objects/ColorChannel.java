package objects;

public class ColorChannel {

  int[][] colorMatrix;

  public ColorChannel(int width, int height) {
    this.colorMatrix = new int[width][height];
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for(int[] ar : colorMatrix) {
      boolean first = true;
      for(int i : ar) {
        if(!first) {
          sb.append(", ");
        }
        sb.append(i);
        first = false;
      }
      sb.append("\n");
    }
    return sb.toString();
  }
}

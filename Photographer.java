import java.util.ArrayList;

public class Photographer {

  private ArrayList<Printable> cameras;

  public Photographer() {
    this.cameras = new ArrayList<Printable>();
  }

  public int cameraCount() {
    return this.cameras.size();
  }

  public void add(Printable camera) {
    this.cameras.add(camera);
  }

  public void remove() {
    if (cameraCount() < 1) {
      return;
    }
    int index = cameraCount();
    this.cameras.remove(index - 1);
  }

  public String print() {
    String cameraList = "";
    for (Printable camera : cameras) {
      cameraList = cameraList + camera.printDetails() + ", ";
    }
    return cameraList;
  }

}

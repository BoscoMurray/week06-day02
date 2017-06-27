import java.util.ArrayList;

public class Photographer {

  private ArrayList<Camera> cameras;

  public Photographer() {
    this.cameras = new ArrayList<Camera>();
  }

  public int cameraCount() {
    return this.cameras.size();
  }

  public void add(Camera camera) {
    this.cameras.add(camera);
  }

  public void remove() {
    if (cameraCount() < 1) {
      return;
    }
    int index = cameraCount();
    this.cameras.remove(index - 1);
  }

}

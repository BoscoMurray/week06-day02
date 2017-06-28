import java.util.ArrayList;
import java.util.HashMap;

public class Photographer {

  private ArrayList<Printable> cameras;
  private HashMap<String, Integer> journal;

  public Photographer() {
    this.cameras = new ArrayList<Printable>();
    this.journal = new HashMap<String, Integer>();
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

  public String printCameras() {
    String cameraList = "";
    for (Printable camera : cameras) {
      cameraList = cameraList + camera.printDetails() + " & ";
    }
    cameraList = cameraList.substring(0, cameraList.length()-3);
    return cameraList;
  }

  public void addToJournal(String date, Integer quantity) {
    journal.put("date", quantity);
  }

  public int numberOfPhotos() {
    int numberOfPhotos = 0;
    for (int value : journal.values()) {
      numberOfPhotos += value;
    }
    return numberOfPhotos;
  }

}

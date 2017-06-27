import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class PhotographerTest {
  Camera camera01;
  Photographer photographer;
  AnalogCamera acamera;
  DigitalCamera dcamera;

  @Before
  public void before() {
    camera01 = new Camera("Nikon 34T");
    photographer = new Photographer();
    acamera = new AnalogCamera();
    dcamera = new DigitalCamera();
  }

  @Test
  public void canAddCamera() {
    photographer.add(camera01);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canRemoveCamera() {
    photographer.add(camera01);
    photographer.remove();
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void analogCameraCanPrint() {
    assertEquals("Nikon 34T, Noise reduction filter, Hi-resolution", acamera.printDetails());
  }

  @Test
  public void digitalCameraCanPrint() {
    assertEquals("Sony ILCE5100L, No noise reduciton, Lo-resolution", dcamera.printDetails());
  }


}
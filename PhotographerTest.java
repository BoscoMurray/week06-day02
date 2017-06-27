import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class PhotographerTest {
  Camera camera01;
  Photographer photographer;

  @Before
  public void before() {
    camera01 = new Camera("Nikon 34T");
    photographer = new Photographer();
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

}
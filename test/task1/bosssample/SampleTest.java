package task1.bosssample;

import org.junit.Test;

import static task1.bosssample.HouseBuilder.newHouse;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/25/15.
 */
public class SampleTest {

  @Test
  public void happyPath() {
     House house = newHouse()
             .withNumber("1")
             .addDoor(new Door())
             .addDoor(new Door())
             .build();
  }
}

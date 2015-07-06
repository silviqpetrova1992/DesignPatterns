package task1.factorymethodnew;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 7/1/15.
 */
public class BricksMessages implements Messages {
  @Override
  public String forDoor() {
    return "The door of the BricksHouse";
  }

  @Override
  public String forWindow() {
    return "The window of the BricksHouse";
  }

  @Override
  public String forFloor() {
    return "The floor of the BricksHouse";
  }
}

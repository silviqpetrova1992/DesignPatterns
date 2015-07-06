package task1.factorymethodnew;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 7/1/15.
 */
public class WoodenMessages implements Messages {
  @Override
  public String forDoor() {
    return "Wooden door";
  }

  @Override
  public String forWindow() {
    return "Wooden window";
  }

  @Override
  public String forFloor() {
    return "Wooden floor";
  }
}

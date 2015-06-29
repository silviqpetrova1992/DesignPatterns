package test;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/25/15.
 */
public class WoodDoorFactory implements DoorFactory {
  @Override
  public String createDoor() {
    return "wood door";
  }
}

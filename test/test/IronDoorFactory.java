package test;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/25/15.
 */
public class IronDoorFactory implements DoorFactory {

  @Override
  public String createDoor() {
    return "iron door";
  }

}

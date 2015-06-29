package task1.abstractfactory;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public class RealWoodHouseMessages implements HouseMessages {
  @Override
  public String forDoor() {
    return "The Door is wooden.";
  }

  @Override
  public String forWindow() {
    return "The Window is wooden.";
  }

  @Override
  public String forFloor() {
    return "The floor is wooden.";
  }

  @Override
  public String forName() {
    return "Wooden House.";
  }
}

package task1.abstractfactory;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public class WoodHouseFactory extends HouseFactory {

  private final HouseMessages messages;

  public WoodHouseFactory(HouseMessages messages) {
    this.messages = messages;
  }

  @Override
  public Door createDoor() {
    return new WoodenDoor(messages);
  }

  @Override
  public Window createWindow() {
    return new WoodenWindow(messages);
  }

  @Override
  public Floor createFloor() {
    return new WoodenFloor(messages);
  }
}

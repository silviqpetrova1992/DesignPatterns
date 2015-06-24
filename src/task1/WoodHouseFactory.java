package task1;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public class WoodHouseFactory implements HouseFactory {
  @Override
  public Door addDoor() {
    return new WoodenDoor();
  }

  @Override
  public Window addWindow() {
    return new WoodenWindow();
  }

  @Override
  public Floor addFloor() {
    return new WoodenFloor();
  }
}

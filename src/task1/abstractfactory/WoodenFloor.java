package task1.abstractfactory;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public class WoodenFloor implements Floor {
  private final HouseMessages messages;

  public WoodenFloor(HouseMessages messages) {

    this.messages = messages;
  }

  @Override
  public String toString() {
    return messages.forFloor();
  }
}

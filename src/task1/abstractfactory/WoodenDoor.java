package task1.abstractfactory;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public class WoodenDoor implements Door {
  private final HouseMessages messages;

  public WoodenDoor(HouseMessages messages) {

    this.messages = messages;
  }

  @Override
  public String toString() {
    return messages.forDoor();
  }
}

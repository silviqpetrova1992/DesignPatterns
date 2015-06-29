package task1.abstractfactory;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public class WoodenWindow implements Window {
  private final HouseMessages messages;

  public WoodenWindow(HouseMessages messages) {

    this.messages = messages;
  }

  @Override
  public String toString() {
    return messages.forWindow();
  }
}

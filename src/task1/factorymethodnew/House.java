package task1.factorymethodnew;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/25/15.
 */
public class House {
  private final Messages messages;
  protected String door;
  protected   String window;
  protected String floor;

  public House(Messages messages) {
    this.messages = messages;
    this.door=messages.forDoor();
    this.floor=messages.forFloor();
    this.window=messages.forWindow();
  }

  public String getDescription(){
    return door+" "+window+" "+floor;
  }
}

package task1.abstractfactory;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public class House {
  protected String name;
  protected Door door;
  protected Window window;
  protected Floor floor;

  public House(HouseFactory factory) {
    this.door = factory.createDoor();
    this.window = factory.createWindow();
    this.floor = factory.createFloor();
  }

  /**
   * Set the name of the house
   *
   * @param name The name ot the house
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Abstract method, which make/build the specific type ot house.
   */
  //public abstract void makeHouse();

  /**
   * Make a String from the name and the other parts of the house
   *
   * @return output The String, which contained all information about the house
   */
  public String toString() {
    String output = name + door + window + floor;
    return output;
  }
}

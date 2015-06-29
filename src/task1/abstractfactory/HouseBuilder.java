package task1.abstractfactory;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public abstract class HouseBuilder {

  protected HouseBuilder() {
  }

  protected HouseMessages messages;

  protected abstract House makeHouse();

  /**
   * Order the house from the Builder
   *
   * @return theHouse The desired house
   */
  public House orderTheHouse() {
    House theHouse = makeHouse();
    return theHouse;
  }
}

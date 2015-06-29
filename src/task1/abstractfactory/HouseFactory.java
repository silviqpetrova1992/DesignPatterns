package task1.abstractfactory;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public abstract class HouseFactory {
  /**
   * Add a door to the house
   *
   * @return the desired door
   */
  public abstract Door createDoor();

  /**
   * Add a window to the house
   *
   * @return the desired window
   */
  public abstract Window createWindow();

  /**
   * add a floor to the house
   *
   * @return the desired floor
   */
  public abstract Floor createFloor();

  public House createHouse(){
    return new House(this);
  }
}

package task1.abstractfactory;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public interface HouseMessages {
  /**
   * Make a message,which will appear when forDoor() is called
   *
   * @return the message
   */
  public String forDoor();

  /**
   * Make a message,which will appear when forWindow() is called
   *
   * @return the message
   */
  public String forWindow();

  /**
   * Make a message,which will appear when forFloor() is called
   *
   * @return the message
   */
  public String forFloor();

  /**
   * Make a message,which will appear when forName() is called
   *
   * @return the message
   */
  public String forName();
}

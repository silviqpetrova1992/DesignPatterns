package task1;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public abstract class HouseBuilding {
  protected abstract House makeHouse();
  public House  orderTheHouse(){
    House  theHouse=makeHouse();
    System.out.println(theHouse.display());
    return theHouse;
  }
}

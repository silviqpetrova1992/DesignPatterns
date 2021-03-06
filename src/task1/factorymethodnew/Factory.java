package task1.factorymethodnew;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/25/15.
 */
public class Factory {
  public  House createHouse(String house){
    if(house.equalsIgnoreCase("WOODEN")){
      return new House(new WoodenMessages());
    }
    if(house.equalsIgnoreCase("BRICKS")){
      return new House(new BricksMessages());
    }
    return null;
  }
}

package task1.abstractfactory;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public class HouseTesting {
  public static void main(String[] args) {
    //HouseMessages messages=new RealWoodHouseMessages();
    HouseBuilder woodHouse=new WoodenHouseBuilder();
    House house=woodHouse.orderTheHouse();
    System.out.println(house.toString());
  }
}

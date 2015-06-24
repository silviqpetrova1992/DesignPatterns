package task1;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public class WoodenHouseBuilding extends HouseBuilding {
  @Override
  protected House makeHouse() {
    HouseFactory houseFactory=new WoodHouseFactory();
    House house=new WoodenHouse(houseFactory);
    house.makeHouse();
    house.setName("Wooden House");
    return  house;
  }
}

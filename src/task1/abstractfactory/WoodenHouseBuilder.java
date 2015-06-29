package task1.abstractfactory;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public class WoodenHouseBuilder extends HouseBuilder {
  public WoodenHouseBuilder() {
    messages = new RealWoodHouseMessages();
  }

  @Override
  protected House makeHouse() {

    HouseFactory houseFactory = new WoodHouseFactory(messages);
    // House house = new WoodenHouse(houseFactory);
    // house.makeHouse();
    House house = houseFactory.createHouse();
    house.setName(messages.forName());
    return house;
  }
}

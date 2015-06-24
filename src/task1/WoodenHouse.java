package task1;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public class WoodenHouse extends House {
  private final HouseFactory houseFactory;

  public WoodenHouse(HouseFactory houseFactory) {
    super();

    this.houseFactory = houseFactory;
  }

  @Override
  public void makeHouse() {

    window=houseFactory.addWindow();
    door=houseFactory.addDoor();
    floor=houseFactory.addFloor();
  }
}

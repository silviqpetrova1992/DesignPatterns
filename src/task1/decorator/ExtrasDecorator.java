package task1.decorator;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public class ExtrasDecorator implements House {
  private final House house;

  public ExtrasDecorator(House house) {
    this.house = house;
  }

  @Override
  public String getDescription() {
    return house.getDescription();
  }
}

package task1.decorator;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public class Door extends ExtrasDecorator{
  public Door(House house) {
    super(house);
  }

  @Override
  public String getDescription() {
    return super.getDescription()+"Door";
  }
}

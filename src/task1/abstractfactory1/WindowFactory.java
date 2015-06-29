package task1.abstractfactory1;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public class WindowFactory extends AbstractFactory {

  @Override
  PartOfHouse createPartOfHouse(String part) {
    if(part.equalsIgnoreCase("DOUBLE WINDOW")){
      return new DoubleWindow();
    }
    if(part.equalsIgnoreCase("WOODEN WINDOW")){
      return new WoodWindow();
    }
    return null;
  }
}

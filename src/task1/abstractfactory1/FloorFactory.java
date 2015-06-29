package task1.abstractfactory1;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/26/15.
 */
public class FloorFactory extends  AbstractFactory {
  @Override
  PartOfHouse createPartOfHouse(String part) {
    if(part.equalsIgnoreCase("WOOD FLOOR")){
      return new WoodFloor();
    }
    return null;
  }
}

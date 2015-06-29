package task1.abstractfactory1;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/26/15.
 */
public class DoorFactory extends AbstractFactory {
  @Override
  PartOfHouse createPartOfHouse(String part) {
    if(part.equalsIgnoreCase("WOOD DOOR")){
      return new WoodDoor();
    }
    return null;
  }
}

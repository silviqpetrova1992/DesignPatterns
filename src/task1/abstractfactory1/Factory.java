package task1.abstractfactory1;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public class Factory extends  AbstractFactory{
  @Override
  PartOfHouse createPartOfHouse(String part) {
    if(part.toLowerCase().contains("door".toLowerCase())){
      return (new DoorFactory()).createPartOfHouse(part);
    }
    if(part.toLowerCase().contains("window".toLowerCase())){
      return (new WindowFactory()).createPartOfHouse(part);
    }
    if(part.toLowerCase().contains("floor".toLowerCase())){
      return (new FloorFactory()).createPartOfHouse(part);
    }
    return null;
  }
}

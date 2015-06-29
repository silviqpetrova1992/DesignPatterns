package test;

/**
* Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/25/15.
*/
class WoodAbstractFactory implements AbstractFactory {

  @Override
  public DoorFactory createDoorFactory() {
    return new WoodDoorFactory();
  }

  @Override
  public WindowFactory createWindowFactory() {
    return new WoodWindowFactory();
  }
}

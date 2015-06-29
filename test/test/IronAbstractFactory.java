package test;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/25/15.
 */
public class IronAbstractFactory implements AbstractFactory {

  @Override
  public DoorFactory createDoorFactory() {
    return new IronDoorFactory();
  }

  @Override
  public WindowFactory createWindowFactory() {
    return new IronWindowFactory();
  }

}

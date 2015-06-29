package test;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/25/15.
 */
public class Sample {


  public static void main(String[] args) {
    AbstractFactory factory;

    if ("iron".equals("wood")) {
      factory = new IronAbstractFactory();
    } else {
      factory = new WoodAbstractFactory();
    }

    // app

    WindowFactory windowFactory = factory.createWindowFactory();
    DoorFactory doorFactory = factory.createDoorFactory();

    String door = doorFactory.createDoor();
    String window = windowFactory.createWindow();


    System.out.println("Created door: " + door);
    System.out.println("Created window: " + window);

  }
}

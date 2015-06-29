package task1.abstractfactory1;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public class AbstractFactoryDemo {

  public static void main(String[] args) {

  //  PartOfHouse part = factory.createWindowFactory().getWindow("testt");

House house1=new House();
    house1.addPartOfHouse("Wood Door");
    house1.addPartOfHouse("Double window");
    house1.addPartOfHouse("Wood floor");
    System.out.println( house1.getDescription());
  }
}

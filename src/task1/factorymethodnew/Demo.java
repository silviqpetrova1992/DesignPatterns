package task1.factorymethodnew;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/25/15.
 */
public class Demo {
  public static void main(String[] args) {
    Factory factory=new Factory();
    House house1=factory.createHouse("wooden");
    System.out.println(house1.getDescription());
    House house2=factory.createHouse("bricks");
    System.out.println(house2.getDescription());
  }
}

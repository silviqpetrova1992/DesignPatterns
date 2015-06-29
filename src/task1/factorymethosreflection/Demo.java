package task1.factorymethosreflection;

import static task1.factorymethosreflection.Factory.createHouse;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/25/15.
 */
public class Demo {
  public static void main(String[] args) {
    House house1= createHouse(BricksHouse.class);
    System.out.println(house1.getDescription());
    House house2=createHouse(WoodenHouse.class);
    System.out.println(house2.getDescription());
  }
}

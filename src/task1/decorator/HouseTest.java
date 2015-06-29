package task1.decorator;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public class HouseTest {
  public static void main(String[] args) {
    House house=new Door(new PlainHouse());
    System.out.println( house.getDescription());
  }
}

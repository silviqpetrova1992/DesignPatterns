package task4;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 7/1/15.
 */
public class IntegerProxy implements Integer {
  private int number;
  private RealInteger realInteger;

  public IntegerProxy(int number) {
    this.number = number;
  }

  @Override
  public void display() {
if(realInteger==null){
  realInteger=new RealInteger(number);
}
    realInteger.display();
  }
}

package task4;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 7/1/15.
 */
public class RealDisplay implements Display {
  @Override
  public void display(int number) {
    System.out.println(this.getClass().getSimpleName()+ " - "+number);
  }
}

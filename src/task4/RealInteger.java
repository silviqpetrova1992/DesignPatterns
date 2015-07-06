package task4;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 7/1/15.
 */
public class RealInteger implements Integer {
  private int number;
  private Display display;

  public RealInteger(int number) {
    this.number = number;
    display = new RealDisplay();
  }

  @Override
  public void display() {
    display.display(number);
  }
}

package task5;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/30/15.
 */
public class Item {
  private String name;
  private double price;

  public Item(String name, double price) {
    this.name = name;
    this.price = price;
  }
  public String toString(){
    return name+ "-"+price;
  }
}

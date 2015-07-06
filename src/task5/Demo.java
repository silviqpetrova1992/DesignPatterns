package task5;

import java.util.ArrayList;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/30/15.
 */
public class Demo {
  public static void main(String[] args) {
    Item morkovi = new Item("morkovi", 0.8);
    AvailableItemsObservable available = new AvailableItemsObservable();
    ArrayList<Item> selledItems = new ArrayList<Item>();
    selledItems.add(morkovi);
    SelledItemsObservable selled = new SelledItemsObservable(selledItems);
    CustomObserver observer1 = new CustomObserver();
    CustomObserver observer2 = new CustomObserver();
    available.addObserver(observer1);
    available.addObserver(observer2);
    selled.addObserver(observer1);
    selled.addObserver(observer2);
    available.addItem(new Item("zele", 1.2));
    available.addItem(new Item("shokolad", 1.8));
    selled.removeItem(morkovi);
    available.removeObserver(observer1);
    available.addItem(new Item("keks",3.5));
  }
}

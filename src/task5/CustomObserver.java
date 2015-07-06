package task5;

import java.util.ArrayList;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/30/15.
 */
public class CustomObserver implements Observer {
 volatile ArrayList<Item> selledItemsArray = new ArrayList<Item>();
 volatile ArrayList<Item> availableItemsArray = new ArrayList<Item>();

  @Override
  public void  handleEvent(Object o, Observable observable) {
    if(observable.getClass()==AvailableItemsObservable.class){
      availableItemsArray=(ArrayList)o;
      System.out.println("Add "+o.toString());
    }
    if(observable.getClass()==SelledItemsObservable.class){
      selledItemsArray=(ArrayList)o;
      System.out.println("Remove "+o.toString());
    }
  }
}

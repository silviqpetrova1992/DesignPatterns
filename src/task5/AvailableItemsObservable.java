package task5;

import java.util.ArrayList;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/30/15.
 */
public class AvailableItemsObservable implements Observable {
  ArrayList<Observer> observers = new ArrayList<Observer>();
ArrayList<Item> availableItemsArray=new ArrayList<Item>();
  @Override
  public void addObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    int index = observers.indexOf(o);
    observers.remove(index);
  }

  @Override
  public void notifyObservers() {
    for(Observer observer:observers){
      observer.handleEvent(availableItemsArray,this);
    }

  }
  public void addItem(Item item){
    availableItemsArray.add(item);
    notifyObservers();
  }
}

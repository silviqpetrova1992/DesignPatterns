package task5;

import java.util.ArrayList;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/30/15.
 */
public class SelledItemsObservable implements Observable {
  ArrayList<Observer> observers = new ArrayList<Observer>();
  ArrayList<Item> selledItemsArray =new ArrayList<Item>();

  public SelledItemsObservable(ArrayList<Item> array) {
    selledItemsArray=array;
  }

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
  observer.handleEvent(selledItemsArray, this);
}
  }
  public void removeItem(Item item){
    int i=selledItemsArray.indexOf(item);
    selledItemsArray.remove(i);
    notifyObservers();
  }
}

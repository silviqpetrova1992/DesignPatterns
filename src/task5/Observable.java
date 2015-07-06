package task5;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/30/15.
 */
public interface Observable {
  void addObserver(Observer o);

  void removeObserver(Observer o);

  void notifyObservers();
}

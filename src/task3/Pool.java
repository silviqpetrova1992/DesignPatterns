package task3;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/29/15.
 */
public class Pool {
  private final int MAX_AVAILABLE;
  private final Object[] objectArray;
  private final boolean[] locked;
  static private Semaphore semaphore;

  public Pool(Object[] objectArray) {
    this.MAX_AVAILABLE = objectArray.length;
    this.objectArray = objectArray;
    locked = new boolean[MAX_AVAILABLE];
    semaphore = new Semaphore(MAX_AVAILABLE);
  }

  public Object acquire() throws NotAvailableResurseException {

    try {
      if(semaphore.tryAcquire(1000, TimeUnit.MILLISECONDS)){
         System.out.println(semaphore);

       return getNextAvailableItem();
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    throw new NotAvailableResurseException();
  }

  private Object getNextAvailableItem() {
    for (int i = 0; i <= MAX_AVAILABLE; i++) {
      if (!locked[i]) {
        locked[i] = true;
        return objectArray[i];
      }
    }
    return null;
  }

  public void release(Object o) {
    markAsUnlocked(o);
    semaphore.release();

  }

  private boolean markAsUnlocked(Object o) {
    for (int i = 0; i <= MAX_AVAILABLE; i++) {
      if (o.equals(objectArray[i])) {
        if (locked[i]) {
          locked[i] = false;
          return true;
        } else {
          return false;
        }
      }
    }
    return false;
  }
}
package task2;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/29/15.
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton() {
      System.out.println("Singleton created");
    }
    public synchronized static Singleton getInstance() {
      if(instance == null) {
        instance = new Singleton();
      }
      return instance;
    }
}

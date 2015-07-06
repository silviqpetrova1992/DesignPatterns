package task2;

import org.junit.Ignore;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/29/15.
 */
public class SingletonTest {
  @Test
  public void happyPath() {
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();
    assertThat(singleton1, is(sameInstance(singleton2)));
  }

  @Test
  public void interactingWithTwoThreads() {
    SingletonThread singletonThread1 = new SingletonThread();
    SingletonThread singletonThread2 = new SingletonThread();

    singletonThread1.start();
    singletonThread2.start();
    try {
      singletonThread1.join();
      singletonThread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(singletonThread1.getSingleton().toString());
    System.out.println(singletonThread2.getSingleton().toString());
    assertThat(singletonThread1.getSingleton(), is(sameInstance(singletonThread2.getSingleton())));
  }
@Ignore
  @Test
  public void createSingletonWithReflection() {
    try {
      Constructor constructor = Singleton.class.getDeclaredConstructor();
      constructor.setAccessible(true);
      Object singleton1 = constructor.newInstance();
      Object singleton2 = constructor.newInstance();
      assertThat(singleton1, is(sameInstance(singleton2)));
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }

  }

  class SingletonThread extends Thread {
    private Singleton singleton = null;

    @Override
    public void run() {
      singleton = Singleton.getInstance();
    }

    public Singleton getSingleton() {
      return singleton;
    }
  }
}

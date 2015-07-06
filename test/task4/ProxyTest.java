package task4;

import org.jmock.auto.Mock;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 7/1/15.
 */
public class ProxyTest {
  @Rule
  public JUnitRuleMockery context=new JUnitRuleMockery();
  @Mock
  Display display;
  @Test
  public void happyPath() throws NoSuchFieldException, IllegalAccessException {

    Integer integer=new IntegerProxy(10);
    Class<?> c=integer.getClass();
    System.out.println(c.getSimpleName());
    Field field=c.getDeclaredField("realInteger");
    field.setAccessible(true);
    integer.display();
    Object field1=field.get(integer);
    Field display=(((RealInteger)field1).getClass().getDeclaredField("display"));
    display.set(field1,display);

  }
}

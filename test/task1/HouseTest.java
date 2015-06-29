package task1;

import org.jmock.Expectations;
import org.jmock.auto.Mock;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;
import task1.abstractfactory.House;
import task1.abstractfactory.HouseBuilder;
import task1.abstractfactory.HouseMessages;
import task1.abstractfactory.WoodenHouseBuilder;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public class HouseTest {
  @Rule
  public JUnitRuleMockery context = new JUnitRuleMockery();
  @Mock
  HouseMessages messages;

  @Test
  public void happyPath() {
    context.checking(new Expectations() {
      {
        oneOf(messages).forDoor();
        will(returnValue("The wooden door."));
        oneOf(messages).forWindow();
        will(returnValue("The wooden window."));
        oneOf(messages).forFloor();
        will(returnValue("The wooden floor."));
        oneOf(messages).forName();
        will(returnValue("Wooden House."));
      }
    });
    HouseBuilder houseBuilder = new WoodenHouseBuilder();
    setMessagesField(houseBuilder, messages);
    House house = houseBuilder.orderTheHouse();
    assertThat(house.toString(), is("Wooden House.The wooden door.The wooden window.The wooden floor."));

  }

  private void setMessagesField(HouseBuilder houseBuilder, HouseMessages messages) {
    Class<?> c = houseBuilder.getClass().getSuperclass();
    try {
      Field field = c.getDeclaredField("messages");
      field.setAccessible(true);
      field.set(houseBuilder, messages);
    } catch (NoSuchFieldException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }
}

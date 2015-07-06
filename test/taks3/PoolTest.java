package taks3;

import org.junit.Before;
import org.junit.Test;
import task3.NotAvailableResurseException;
import task3.Pool;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 7/1/15.
 */
public class PoolTest {
  Pool pool;
  String a, b, c, d;

  @Before
  public void init() {
    Object[] array = {"a", "b", "c"};
    pool = new Pool(array);
  }

  @Test
  public void happtyPath() {

    try {
      a = (String) pool.acquire();
      b = (String) pool.acquire();
      c = (String) pool.acquire();
      pool.release(c);
      d = (String) pool.acquire();
      assertThat(a, is("a"));
      assertThat(b, is("b"));
      assertThat(c, is("c"));
      assertThat(d, is("c"));
    } catch (NotAvailableResurseException e) {
      e.printStackTrace();
    }

  }

  @Test(expected = NotAvailableResurseException.class)
  public void acquireMoreThanItsPossible() throws NotAvailableResurseException {

    a = (String) pool.acquire();
    b = (String) pool.acquire();
    c = (String) pool.acquire();
    d = (String) pool.acquire();
  }


}

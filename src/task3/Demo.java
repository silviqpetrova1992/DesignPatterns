package task3;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/29/15.
 */
public class Demo {
  public static void main(String[] args) {
    Object[] array ={"1","2","3"};
    Pool pool = new Pool( array);
    try{
    String string1=(String)pool.acquire();
    System.out.println(string1);
    String string2=(String)pool.acquire();
    System.out.println(string2);
    String string3=(String)pool.acquire();
    System.out.println(string3);
   // pool.release(string1);
    String string4=(String)pool.acquire();
    System.out.println(string4);
/*    String string5=(String)pool.acquire();
    System.out.println(string5);*/
    }catch(NotAvailableResurseException e){
      System.err.println("There is no available resurse!");
      return;
    }
  }
}

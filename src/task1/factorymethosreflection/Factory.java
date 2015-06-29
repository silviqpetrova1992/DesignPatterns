package task1.factorymethosreflection;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/25/15.
 */
public class Factory {
  public static <T extends House>T createHouse(Class<T> houseClass){
   T myHouse=null;
    try {
      myHouse=houseClass.newInstance();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
return myHouse;
   /* if(house.equalsIgnoreCase("WOODEN")){
      return new WoodenHouse();
    }
    if(house.equalsIgnoreCase("BRICKS")){
      return new BricksHouse();
    }
    return null;*/
  }
}

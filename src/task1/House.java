package task1;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public abstract class House {
  private  String name;
  Door door;
  Window window;
  Floor floor;

  public void setName(String name) {
    this.name = name;
  }
public  abstract void makeHouse();
  public String display(){
    String output="The house: "+name+" has "+door+ " ,"+ window+" and "+floor;
    return output;
  }
}

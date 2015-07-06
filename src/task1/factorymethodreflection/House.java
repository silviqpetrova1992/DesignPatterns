package task1.factorymethodreflection;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/25/15.
 */
public abstract class House {
  protected String door;
  protected   String window;
  protected String floor;

  public String getDescription(){
    return door+" "+window+" "+floor;
  }
}

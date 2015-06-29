package task1.abstractfactory1;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/24/15.
 */
public class House {
  private String description="";
  private AbstractFactory factory=new Factory();
  public void addPartOfHouse(String part){
  PartOfHouse partOfHouse= factory.createPartOfHouse(part);
    setDescription(partOfHouse.toString());
  }
  public String getDescription(){
    return description;
  }
  private void setDescription(String s){
    description+=s+" ";
  }
}

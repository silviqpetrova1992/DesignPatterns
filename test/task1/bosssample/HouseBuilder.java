package task1.bosssample;

import com.google.common.collect.Lists;

import java.util.List;

/**
* Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/25/15.
*/
class HouseBuilder {

  public static HouseBuilder newHouse() {
    return new HouseBuilder();
  }

  private String number;
  private List<Door> doors = Lists.newArrayList();

  public HouseBuilder withNumber(String number) {
    this.number = number;
    return this;
  }

  public HouseBuilder addDoor(Door door) {
    this.doors.add(door);
    return this;
  }

  public House build() {
    return new House(doors);
  }
}

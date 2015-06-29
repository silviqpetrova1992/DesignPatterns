package test;

/**
* Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 6/25/15.
*/
interface AbstractFactory {
  DoorFactory createDoorFactory();

  WindowFactory createWindowFactory();
}

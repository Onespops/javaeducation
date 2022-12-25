package lesson10;

public class Boat {
  private Engine engine;
  String model;

  public Boat() {
    engine = new Engine();
    model = "";
  }

  public void turnEngineOn() {
    engine.turnOn();
  }

  public void turnEngineOff() {
    engine.turnOff();
  }

  public boolean isEngineOn() {
    return engine.isOn();
  }

  public void rebootEngine() {
    engine.turnOff();
    engine.turnOn();
  }
}

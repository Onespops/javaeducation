package lesson10;

public class Engine {
  private boolean isOn;

  public void turnOn() {
    isOn = true;
  }

  public void turnOff() {
    isOn = false;
  }

  public boolean isOn() {
    return isOn;
  }
}

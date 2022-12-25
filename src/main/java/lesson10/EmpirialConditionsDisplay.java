package lesson10;

public class EmpirialConditionsDisplay implements Observer {
  private float temperature;
  private float humidity;
  private int pressure;

  @Override
  public void update(float temperature, float humidity, int pressure) {
    this.temperature = (temperature * 9 / 5) + 32;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }

  public void display() {
    System.out.printf("В странной американской системе значения:%.1f градусов фаренгейт и %.1f %% влажности. Давление %d мм рт. ст.\n", temperature, humidity, pressure);
  }
}
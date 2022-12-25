package lesson10;

import java.util.LinkedList;
import java.util.List;

class WeatherData implements Observable {
  private List<Observer> observers;
  private float temperature;
  private float humidity;
  private int pressure;

  public WeatherData() {
    observers = new LinkedList<>();
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers)
      observer.update(temperature, humidity, pressure);
  }

  public void setMeasurements(float temperature, float humidity, int pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    notifyObservers();
  }
}
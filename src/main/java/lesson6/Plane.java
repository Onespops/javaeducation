package lesson6;

public class Plane implements Printable, Flying {
  private static long count = 0;

  long id;
  String manufacturer;
  String model;
  double speedMph;

  public Plane() {
    manufacturer = "";
    model = "";
    count += 1000;
    id = count;
  }

  public Plane(String manufacturer, String model, double speedMph) {
    this.manufacturer = manufacturer;
    this.model = model;
    this.speedMph = speedMph;
    count += 1000;
    id = count;
  }

  @Override
  public void print() {
    System.out.println("#" + id + " Plane " + manufacturer + ":" + model +
        " speed = " + (speedMph * MPH_TO_KMH));
  }

  @Override
  public double travel(double time) {
    return speedMph * MPH_TO_KMH * time;
  }
}

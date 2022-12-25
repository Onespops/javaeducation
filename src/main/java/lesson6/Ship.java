package lesson6;

public class Ship implements CanSwim {
  @Override
  public void swim() {
    System.out.println("Плыву, прием");
  }

  @Override
  public double distance(double hour, double knot) {
    return 25 * hour * knot * KNOT_TO_KMH;
  }
}

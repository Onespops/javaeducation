package lesson6;

public interface CanSwim {
  double KNOT_TO_KMH = 1.852;
  double KMH_TO_KNOT = 0.539957;

  void swim();
  double distance(double hour, double knot);
}

package lesson6;

public final class CircleMath {
  private CircleMath(){}

  public static double length(double radius) {
    return 2 * Math.PI * radius;
  }

  public static double area(double radius) {
    return Math.PI * radius * radius;
  }
}

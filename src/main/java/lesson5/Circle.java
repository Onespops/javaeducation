package lesson5;

import java.util.Objects;

public class Circle extends Figure {
  double radius;

  public Circle() {
  }

  public Circle(double x, double y, double radius) {
    super(x, y);
    this.radius = radius;
  }

  @Override
  void print() {
    System.out.println(x + " " + y + " " + radius);
  }

  void length() {
    System.out.println(2 * Math.PI * radius);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Circle circle = (Circle) o;
    return Double.compare(circle.x, x) == 0 &&
        Double.compare(circle.y, y) == 0 &&
        Double.compare(circle.radius, radius) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, radius);
  }
}

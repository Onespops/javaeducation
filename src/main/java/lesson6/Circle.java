package lesson6;

public class Circle extends Figure implements Comparable<Circle> {
  double radius;

  static int count = 0;

  public Circle(double x, double y, double radius) {
    super(x, y);
    this.radius = radius;
  }

  public Circle() {
//    super(); // запускается даже если закомментировать
    count -= 1;
    id = count;
  }

  @Override
  public int compareTo(Circle o) {
    return Double.compare(radius, o.radius);
  }
}

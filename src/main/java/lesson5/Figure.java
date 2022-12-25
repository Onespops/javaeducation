package lesson5;

public class Figure {
  public double x;
  public double y;

  public Figure() {
  }

  public Figure(double x, double y) {
    this.x = x;
    this.y = y;
  }

  void print() {
    System.out.println(x + " " + y);
  }

  void move(double newX, double newY) {
    x = newX;
    y = newY;
  }

  @Override
  public String toString() {
    return "Figure{" +
        "x=" + x +
        ", y=" + y +
        '}';
  }


}

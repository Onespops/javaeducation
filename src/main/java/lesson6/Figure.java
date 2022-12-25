package lesson6;

public class Figure {
  long id;
  public double x;
  public double y;

  static int count = 0; // count - относится к классу

  public Figure() {
    count++;
    id = count;
  }

  public Figure(double x, double y) {
    count++;
    id = count;
    this.x = x;
    this.y = y;
  }

  void print() {
    System.out.println(id+ ": (" + x + ", " + y + ")");
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

  static void printClass() {
    System.out.println("Класс Figure, в нем поля x, y и методы print(), move(newX, newY)");
    System.out.println("Всего создано " + count + " фигур");
  }
}
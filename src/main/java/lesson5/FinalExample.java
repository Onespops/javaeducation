package lesson5;

public class FinalExample {
  final int a;

  final int b = 8;

  public FinalExample(int a) {
    this.a = a;
  }

  final void print() {
    System.out.println("final method");
  }
}

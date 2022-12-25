package lesson5;

public class Parrot extends Animal {
  // в наследнике можно добавлять/изменять поля и методы предка
  private double wingsLength;

  public Parrot() {
    name = "";
  }

  public Parrot(String name, int age) {
    super(name, age);
  }

  public Parrot(String name, int age, double wingsLength) {
    super(name, age);
    this.wingsLength = wingsLength;
  }

  public double getWingsLength() {
    // любые проверки на возможность действия
    return wingsLength;
  }

  public void setWingsLength(double wingsLength) {
    // любые проверки на возможность действия
    this.wingsLength = wingsLength;
  }

  void flapWings() {
    System.out.println("flap");
  }

  @Override // аннотация - метка для компилятора
  public void print() {
    System.out.println("Попугай " + name + " возрастом" + age + " размах крыльев " + wingsLength);
  }
}

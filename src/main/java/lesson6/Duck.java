package lesson6;

import lesson5.Animal;

public class Duck extends Animal implements CanSwim, CanFly {

  public Duck() {
  }

  public Duck(String name, int age) {
    super(name, age);
  }

  @Override
  public void swim() {
    System.out.println("Плыву, кря");
  }

  @Override
  public double distance(double hour, double knot) {
    return 0.1 * hour * knot * KNOT_TO_KMH;
  }


  @Override
  public void fly() {
    System.out.println("Лечу, кря");
  }
}

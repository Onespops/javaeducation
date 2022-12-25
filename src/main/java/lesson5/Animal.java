package lesson5;

public class Animal {
  public String name;
  public int age;

  public Animal() {
    name = "";
  }

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void print() {
    System.out.println("Животное " + name + " возрастом " + age);
  }

  public void birthday() {
    age++;
  }
}

package lesson4;

public class Animal {
  String name;
  int age;

  Animal() {
    name = "";
  }

  Animal(String s, int i) {
    name = s;
    age = i;
  }

  void print() {
    System.out.println("Животное " + name + " возрастом " + age);
  }

  void birthday() {
    age++;
  }
}

package lesson7;

import java.io.Serializable;

public class Person implements Serializable {
  private static long count = 0;

  long id;
  String name;
  transient String password;
  private int age;

  public Person() {
    name = "";
    password = "";
    count += 1;
    id = count;
  }

  public Person(String name, String password, int age) {
    this.name = name;
    this.password = password;
    this.age = age;
    count += 1;
    id = count;
  }

  @Override
  public String toString() {
    return "Person{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", password='" + password + '\'' +
        ", age=" + age +
        '}';
  }
}

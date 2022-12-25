package lesson6;

//import com.google.gson.Gson;
//import com.google.gson.internal.bind.util.ISO8601Utils;

import java.io.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  static void staticKeyword() {
    // static - ключевое слово, обозначающее принадлежность поля/метода классу, а не конкретному объекту
//    System.out.println(Figure.count);
    Figure.printClass();

    Figure f1 = new Figure();
//    System.out.println(Figure.count);
    Figure.printClass();

    Figure f2 = new Figure(2.5, -1.01);
//    System.out.println(Figure.count);
    Figure.printClass();

    System.out.println("f1");
    f1.print();
    System.out.println("f2");
    f2.print();

//    System.out.println(f1.count);
//    Figure.count = 100;
    Circle c = new Circle();
    Figure.printClass();
    System.out.println(c.id);
  }

  static void argsExample(String[] args) {
    System.out.println(Arrays.toString(args));
  }

  static void interfaces() {
    CanSwim[] swimmers = new CanSwim[]{new Duck(), new Ship()};
    for (CanSwim swimmer : swimmers) {
      swimmer.swim();
      System.out.println(swimmer.distance(1, 2));
    }
    Duck d2 = new Duck("Дональд Дак", 15);
    System.out.println("Вторая утка:");
    d2.print();
    d2.swim();
    d2.fly();
  }

  static void comparableExample() {
    Circle c1 = new Circle(1, 2, 5.005);
    Circle c2 = new Circle(-2, 5, 5.005);
    System.out.println(c1.compareTo(c2));
  }

  /*
  Создать final класс CircleMath,
  у которого только один закрытый пустой конструктор
  и два метода, доступные по имени класса:
  double length(double radius),
    который вычисляет и возвращает длину окружности (формула 2 * PI * radius)
  double area(double radius),
    который вычисляет и возвращает площадь окружности (формула PI * radius * radius)
   */
  static void task1() {
    System.out.println(CircleMath.area(3));
    System.out.println(CircleMath.length(3));
  }

  /*
  Создать интерфейс Singing, имеющий определение метода void sing()
  Создать два класса Bird и Singer, реализующие (implements) интерфейс Singing
  Пение Bird - вывод в консоль строки "Чирп",
  пение Singer - вывод в консоль строки "<Пение человека>"
   */
  static void task2() {
    Bird b = new Bird();
    Singer s = new Singer();
    b.sing();
    s.sing();
  }

  static void packages() {
    // Для работы следующего кода необходимо, чтобы была определена библиотека gson
    // Это могут быть или локальная папка с файлами .java или архив .jar
//    Gson gson = new Gson();
//    System.out.println(gson);
  }

  static void exceptions() throws FileNotFoundException {
    // Исключения (исключительные ситуации) - неверная/неизвестная работа программы, приводящяя к остановке jvm
//    System.out.println(5 / 0);
//    int[] ints = new int[2];
//    System.out.println(ints[2]);
    Scanner sc = new Scanner(System.in);
    int[] intArr = new int[]{1,2,3,4,5};
    System.out.println("Введите число от 0 до 4");
    try {
      int i = sc.nextInt();
      System.out.println("Вы выбрали " + intArr[i]);
    } catch (ArrayIndexOutOfBoundsException | ArithmeticException name) {
      System.out.println("Вы ввели число не в диапазоне от 0 до 4");
      System.out.println(name.getMessage());
    } catch (InputMismatchException ex) {
      System.out.println("Вы ввели не целое число, а что-то другое");
      System.out.println(ex.getMessage());
    } finally {
      System.out.println("Конец ввода");
    }

//    Reader in = new FileReader("C:/asd.txt");
//    tryExample();
    throw new WeirdException("weird hello");
  }

  static int tryExample() {
    try{
      System.out.println("1");
      return 1;
    } finally {
      System.out.println("finally");
    }
  }

  public static void main(String[] args) throws FileNotFoundException {
//    staticKeyword();
//    argsExample(args);
//    interfaces();
//    comparableExample();
//    task1();
//    task2();
//    packages();
    exceptions();
  }
}

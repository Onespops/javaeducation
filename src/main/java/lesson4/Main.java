package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static void math() {
    System.out.println(Math.pow(2, 10));
    System.out.println(Math.PI * Math.pow(4.5, 2));

    System.out.println(Math.sin(Math.PI / 2));

    System.out.println(Math.round(3.4));
    System.out.println(Math.round(3.5));
    System.out.println(Math.round(3.6));

    System.out.println(Math.random());
    System.out.println(5 + (int) (Math.random() * 10));
  }

  static void arrays() {
    double[] arr = new double[]{2, 0.1, 9, 4.5};
    System.out.println(Arrays.toString(arr));

    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    System.out.println(Arrays.toString(Arrays.copyOf(arr, 5)));
    System.out.println(Arrays.toString(Arrays.copyOf(arr, 3)));

    // arr2 - ещё одно имя для массива arr (НЕ КОПИЯ)
    double[] arr2 = arr;

    System.out.println(Arrays.binarySearch(arr, 4.5));

    System.out.println(arr == arr2);
    double[] arrCopy = Arrays.copyOf(arr, arr.length);
    System.out.println(arr == arrCopy);
    System.out.println(Arrays.equals(arr, arrCopy));

    int[] ints = new int[10];
    Arrays.fill(ints, 100);
    System.out.println(Arrays.toString(ints));
  }

  static void string() {
    String s = "123aSd";

    System.out.println(s.length()); // длина строки, количество символов
    System.out.println(s.charAt(3)); // взять символ с конкретного индекса

    System.out.println(s.toLowerCase()); // все буквы в маленькие
    System.out.println(s.toUpperCase()); // все буквы в большие

    System.out.println(s.concat("1234")); // соединение, сложение строк
    System.out.println(s.substring(3)); // взять подстроку, начиная с индекса
    System.out.println(s.substring(3, 5)); // взять подстроку начиная и заканчивая индексами

    System.out.println(s.contains("23")); // проверить, содержит ли одна строка другую
    System.out.println(s.contains("ы"));

    s = s.concat("1234");
    // узнать на каком индексе впервые встречается подстрока
    System.out.println(s.indexOf("aSd"));

    System.out.println(s.indexOf("123"));
    // узнать на каком индексе в последний раз встречается подстрока
    System.out.println(s.lastIndexOf("123"));

    String sWithSpaces = "      qwe 123213    ";
    // очистить строку от пробельных символов в начале и в конце
    System.out.println(sWithSpaces.trim());

    String text = "Это небольшой текст, он будет разрезан";
    String[] words = text.split(" ");
    System.out.println(Arrays.toString(words));

    System.out.println(text.equals("это небольшой текст, он будет разрезан"));
    System.out.println(text.equalsIgnoreCase("это небольшой текст, он будет разрезан"));

    String nameWithGarbage = "        Андрей";
    nameWithGarbage = nameWithGarbage.trim();
    System.out.println(nameWithGarbage);

  }

  /*
  Спросить у пользователя строку с помощью nextLine() у Scanner
  Очистить ввод от пробельных символов в начале и в конце
  Получить все слова в строке, которую ввел пользователь и поместить их в массив
  Массив вывести
  Пример:
  "Привет, меня зовут Андрей!     " -> [Привет,, меня, зовут, Андрей!]
   */
  static void task1() {
    Scanner scanner = new Scanner(System.in);
    String phrase = scanner.nextLine();
    // Очистка
    phrase = phrase.trim();
    // Получение массива слов
    String[] words = phrase.split(" ");
    System.out.println(Arrays.toString(words));
  }

  /*
  Узнать, есть ли среди введенных пользователем слов слово "привет"
  (не учитывать регистр)
  Если да, вывести "С нами поздоровались"
  Слова "привет," или "!привет" и т.п. не подходят
   */
  static void task2() {
    Scanner scanner = new Scanner(System.in);
    String phrase = scanner.nextLine();
    phrase = phrase.trim();
    String[] words = phrase.split(" ");
    System.out.println(Arrays.toString(words));

    if (phrase.toLowerCase().contains("привет")) {
      System.out.println("С нами поздоровались");
    }
    for (int i = 0; i < words.length; i++) {
      if (words[i].equalsIgnoreCase("привет")) {
        System.out.println("С нами поздоровались");
        break;
      }
    }
  }

  static void oop() {
//    String client1Name = "Andrew";
//    long client1Id = 123123123L;
//    double client1Balance = 100.1;
//    System.out.println(client1Name);
//    System.out.println(client1Id);
//    System.out.println(client1Balance);

    // Класс - пользовательский тип данных, описывающий состояние и поведение объектов
    // По аналогии: класс - тип данных, объект - переменная
//    Client andrew = new Client();
//    System.out.println(andrew.name);
//    System.out.println(andrew.id);
//    System.out.println(andrew.balance);
//    andrew.name = "Andrew";
//    andrew.id = 123123123L;
//    andrew.balance = 100.1;
//    System.out.println(andrew.name);
//    System.out.println(andrew.id);
//    System.out.println(andrew.balance);

    Client vasya = new Client("Vasiliy", 123123124, 1000.99);
    System.out.println(vasya.name);
    System.out.println(vasya.id);
    System.out.println(vasya.balance);

    Client petya = new Client("Petya", 1);
    petya.print();
    petya.changeBalance(50.5);
    petya.print();
    petya.changeBalance(-20);
    System.out.println("После операций у Пети осталось " + petya.checkBalance() + "$");
  }

  /*
  Создать класс Animal в отдельном файле Animal.java
    Поля:
      строка name с именем
      целое число age с возрастом
    Конструкторы:
      конструктор без аргументов - в name записывает пустую строку
      конструктор с аргументами строка s и числом i - заполняет значения полей name и age
    Методы:
      метод print(), выводящий информацию о животном
      метод birthday(), увеличивающий возраст на 1
  В psvm создать два объекта класса Animal -
  один через пустой конструктор, другой через второй конструктор
  Заполнить поля любыми значениями
  У второго животного вызвать print(), вызвать birthday() и снова вызвать print()
   */
  static void task3() {
    Animal cat = new Animal();
    cat.name = "Barsik";
    cat.age = 7;
    cat.print();

    Animal dog = new Animal("Sharik", 8);
    dog.print();
    dog.birthday();
    dog.print();
  }

  public static void main(String[] args) {
//    math();
//    arrays();
//    string();
//    task1();
//    task2();
//    oop();
    task3();
  }
}

package lesson4;

import java.util.Scanner;

/*
Спросить у пользователя строку с помощью метода nextLine() у сканера
С помощью методов получившейся строки вывести на экран встречается ли строка "привет" внутри введенной строки
Если встречается, то вывести информацию о том, встречается она один раз или несколько
Пример:
При вводе "изучаем методы и классы Java" должно выводить "Слово 'привет' не встречается"
"привет, изучаем методы и классы Java" должно выводить "Слово 'привет' встречается единожды"
"привет, привет, изучаем методы и классы Java" должно выводить "Слово 'привет' встречается больше 1 раза"
 */
public class HW5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    // Если регистр не важен, то
    String inputLower = input.toLowerCase();

    if (!inputLower.contains("привет")) {
      System.out.println("Слово 'привет' не встречается");
    } else if (inputLower.indexOf("привет") == inputLower.lastIndexOf("привет")) {
      System.out.println("Слово 'привет' встречается единожды");

    } else {
      System.out.println("Слово 'привет' встречается больше 1 раза");
      System.out.println("Первый раз встречается на " + inputLower.indexOf("привет"));
      System.out.println("Последний раз встречается на " + inputLower.lastIndexOf("привет"));
    }
  }
}

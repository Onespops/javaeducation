package lesson10;

import lesson10.singleton.Singleton;

import java.util.Scanner;

public class Main {
  static void composition() {
    // Композиция - возможность наличия у одного объекта ссылки на другой объект как поле
    Boat b = new Boat();
    System.out.println(b.isEngineOn());
    b.turnEngineOn();
    System.out.println(b.isEngineOn());
  }

  static void singleton() {
    Singleton s1 = Singleton.getInstance("first");
    System.out.println(s1 + " " + s1.value);
    Singleton s2 = Singleton.getInstance("second");
    System.out.println(s2 + " " + s2.value);

    // Пример подключения к базе данных, в котором не будет происходить множественного подключения
//    DriverManager.getConnection("jdbc:sqlite:test.db");
  }

  static void decorator() {
    // Декоратор - возможность динамически расширять возможности класса
    Scanner sc = new Scanner(System.in);
    System.out.println("Кроме email где хотите получать уведомления?");
    System.out.println("Tg?");
    boolean tgNotify = sc.nextBoolean();
    System.out.println("Vk?");
    boolean vkNotify = sc.nextBoolean();

    Notifier notifier = new EmailNotifier();
    if (tgNotify) {
      notifier = new TgNotifier(notifier);
    }
    if (vkNotify) {
      notifier = new VkNotifier(notifier);
    }
    notifier.notifyClient();
  }

  static void observer() {
    WeatherData weatherData = new WeatherData();

    Observer currentDisplay = new CurrentConditionsDisplay();
    Observer empirialDisplay = new EmpirialConditionsDisplay();

    weatherData.registerObserver(currentDisplay);
    weatherData.registerObserver(empirialDisplay);

    weatherData.setMeasurements(29f, 65f, 745);
    weatherData.setMeasurements(39f, 70f, 760);
    weatherData.setMeasurements(42f, 72f, 763);
  }

  public static void main(String[] args) {
//    composition();
//    singleton();
//    decorator();
    observer();
  }
}

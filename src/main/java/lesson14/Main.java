package lesson14;


import lesson10.singleton.Singleton;

import java.util.Date;

public class Main {
  static void multithreading() {
    System.out.println("Start " + Thread.currentThread().getName());
    MyThread myThread1 = new MyThread();
    MyThread myThread2 = new MyThread();
//    myThread2.setDaemon(true);
//    myThread1.setDaemon(true);
    // Активация потока
    myThread1.start();
    myThread2.start();
    MyRunnable myRunnable = new MyRunnable();
    new Thread(myRunnable).start();
    Runnable runnable = () -> {
      System.out.println("Start anonymous runnable " + Thread.currentThread().getName());
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
      System.out.println("Start anonymous runnable " + Thread.currentThread().getName());
    };
    new Thread(runnable).start();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {}
    System.out.println("End " + Thread.currentThread().getName());
  }

  // Создать два дополнительных (не считая main) потока,
  // каждый из которых будет считать от 1 до 10 с сном в 1 секунду между числами
  // (*) запустить ещё и третий аналогичный поток,
  // который определяется через лямбда выражение "->"
  static void task1() {
    Counter1 c1 = new Counter1();
    c1.start();

    Counter2 c2 = new Counter2();
    new Thread(c2).start();

    Runnable c3 = () -> {
      for (int i = 0; i < 11; i++) {
        System.out.println("lambdaRunnable: " + i);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };
    new Thread(c3).start();
  }

  static void multithreading2() {
    Runnable joined = () -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("joined: " + i);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };
    Thread joinedThread = new Thread(joined);
    joinedThread.start();
    for (int i = 0; i < 10; i++) {
      System.out.println("main: " + i);
      try {
        if (i == 2) {
          joinedThread.join();
        } else {
          Thread.sleep(1000);
        }
      } catch (InterruptedException e) {}
    }
  }

  static void multithreading3() {
    Runnable firstRunnable = () -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("first: " + i);
        Date then = new Date();
        try {
          Thread.sleep(1000);
          Date dateAfterWakeUp = new Date();
          System.out.println(dateAfterWakeUp.getTime() - then.getTime());
        } catch (InterruptedException e) {
          Date dateAfterInterrupt = new Date();
          System.out.println(dateAfterInterrupt.getTime() - then.getTime());
          System.out.println("Interrupted");
        }
      }
    };
    Thread firstThread = new Thread(firstRunnable);
    firstThread.start();
    Runnable secondRunnable = () -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("second: " + i);
        if (i==7) {
          firstThread.interrupt();
        }
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
      }
    };
    Thread secondThread = new Thread(secondRunnable);
    secondThread.start();
  }

  static void badSingleton() {
    Runnable singletonCreator = () -> {
      Singleton s = Singleton.getInstance(String.valueOf(new Date().getTime()));
      System.out.println(s + " " + s.value);
    };
    new Thread(singletonCreator).start();
    new Thread(singletonCreator).start();
  }

  static void goodSingleton() {
    Runnable singletonCreator = () -> {
      GoodSingleton s = GoodSingleton.getInstance(String.valueOf(new Date().getTime()));
      System.out.println(s + " " + s.value);
    };
    new Thread(singletonCreator).start();
    new Thread(singletonCreator).start();
  }

  public static void main(String[] args) {
//    multithreading();
//    task1();
//    multithreading2();
//    multithreading3();
//    badSingleton();
    goodSingleton();
  }
}

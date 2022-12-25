package lesson14;

public class Counter1 extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 11; i++) {
      System.out.println("ThreadExtends: " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

package lesson14;

public class Counter2 implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 11; i++) {
      System.out.println("RunnableImpl: " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

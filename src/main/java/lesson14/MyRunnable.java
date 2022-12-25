package lesson14;

public class MyRunnable implements Runnable {
  @Override
  public void run() {
    System.out.println("Start runnable " + Thread.currentThread().getName());
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
    }
    System.out.println("Start runnable " + Thread.currentThread().getName());
  }
}
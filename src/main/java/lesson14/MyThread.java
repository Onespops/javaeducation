package lesson14;

public class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("Start " + Thread.currentThread().getName());
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
    }
    System.out.println("End " + Thread.currentThread().getName());
  }
}

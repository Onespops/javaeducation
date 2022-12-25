package lesson10.singleton;

public class Singleton {
  private static Singleton instance = null;
  public String value;

  private Singleton(String value) {
    this.value = value;
  }

  public static Singleton getInstance(String value) {
    if (instance == null) {
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      instance = new Singleton(value);
    }
    return instance;
  }
}

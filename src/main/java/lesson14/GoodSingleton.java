package lesson14;



public class GoodSingleton {
  private static GoodSingleton instance = null;
  public String value;

  private GoodSingleton(String value) {
    this.value = value;
  }

  public static GoodSingleton getInstance(String value) {
    synchronized (GoodSingleton.class) {
      if (instance == null) {
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        instance = new GoodSingleton(value);
      }
    }
    return instance;
  }
}

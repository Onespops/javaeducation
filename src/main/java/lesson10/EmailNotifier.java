package lesson10;

public class EmailNotifier implements Notifier {

  @Override
  public void notifyClient() {
    System.out.println("Оповещение по email");
  }
}

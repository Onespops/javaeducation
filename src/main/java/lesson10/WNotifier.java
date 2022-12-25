package lesson10;

public class WNotifier extends NotifierDecorator {

  public WNotifier(Notifier wrapee) {
    super(wrapee);
  }

  @Override
  public void notifyClient() {
    System.out.println("Whatsup оповещение");
    wrapee.notifyClient();
  }
}

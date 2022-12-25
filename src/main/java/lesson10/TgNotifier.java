package lesson10;

public class TgNotifier extends NotifierDecorator {
  public TgNotifier(Notifier wrapee) {
    super(wrapee);
  }

  @Override
  public void notifyClient() {
    System.out.println("Telegram оповещение");
    wrapee.notifyClient();
  }
}

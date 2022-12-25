package lesson10;

public abstract class NotifierDecorator implements Notifier {
  protected Notifier wrapee;

  public NotifierDecorator(Notifier wrapee) {
    this.wrapee = wrapee;
  }

}

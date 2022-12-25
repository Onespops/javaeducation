package lesson10;

public class VkNotifier extends NotifierDecorator {
  public VkNotifier(Notifier wrapee) {
    super(wrapee);
  }

  @Override
  public void notifyClient() {
    System.out.println("Vk оповещение");
    wrapee.notifyClient();
  }
}

package lesson5;

public class Bush extends Plant {
  public Bush() {
  }

  public Bush(double height, double width) {
    super(height, width);
  }

  @Override
  public void grow() {
    width += 0.05;
  }
}

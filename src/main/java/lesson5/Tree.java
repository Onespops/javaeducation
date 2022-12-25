package lesson5;

public class Tree extends Plant {
  public Tree() {
  }

  public Tree(double height, double width) {
    super(height, width);
  }

  @Override
  public void grow() {
    height += 0.9;
  }
}

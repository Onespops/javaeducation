package lesson9;

public class Node {
  String info;
  Node left;
  Node right;

  public Node(String info) {
    this.info = info;
  }

  public Node(String info, Node left, Node right) {
    this.info = info;
    this.left = left;
    this.right = right;
  }

  @Override
  public String toString() {
    return "Node{" +
        "info='" + info + '\'' +
        '}';
  }
}

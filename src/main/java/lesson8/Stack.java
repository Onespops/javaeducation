package lesson8;

import java.util.LinkedList;

public class Stack {

  private LinkedList<Integer> values;

  public Stack() {
    values = new LinkedList<>();
  }

  public void push(Integer newElem) {
    values.add(newElem);
  }

  public Integer pop() {
    return values.remove(values.size() - 1);
  }

  public Integer peek() {
    return values.get(values.size() - 1);
  }

  public int size() {
    return values.size();
  }

  public boolean isEmpty() {
    return values.isEmpty();
  }

  @Override
  public String toString() {
    return "Stack" + values;
  }
}

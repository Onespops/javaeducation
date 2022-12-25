package lesson8;

import java.util.LinkedList;

public class Queue {

  private LinkedList<Integer> values;

  public Queue() {
    values = new LinkedList<>();
  }

  public void queue(Integer newElem) {
    values.add(newElem);
  }

  public Integer dequeue() {
    return values.remove(0);
  }

  public Integer peek() {
    return values.get(0);
  }

  public int size() {
    return values.size();
  }

  public boolean isEmpty() {
    return values.isEmpty();
  }

  @Override
  public String toString() {
    return "Queue" + values;
  }
}

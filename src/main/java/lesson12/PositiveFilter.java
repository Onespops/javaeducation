package lesson12;

import java.util.function.Predicate;

public class PositiveFilter implements Predicate<Integer> {
  @Override
  public boolean test(Integer integer) {
    return integer > 0;
  }
}

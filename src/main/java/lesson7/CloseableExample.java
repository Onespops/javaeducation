package lesson7;

import java.io.Closeable;
import java.io.IOException;

public class CloseableExample implements Closeable {
  public CloseableExample() {
    System.out.println("кастомный класс открылся");
  }

  @Override
  public void close() throws IOException {
    System.out.println("Кастомный класс закрылся");
  }
}

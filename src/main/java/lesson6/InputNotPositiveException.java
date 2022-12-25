package lesson6;

import java.util.InputMismatchException;

public class InputNotPositiveException extends InputMismatchException {
  public InputNotPositiveException() {
  }

  public InputNotPositiveException(String s) {
    super(s);
  }
}

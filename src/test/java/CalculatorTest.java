import jdk.nashorn.internal.ir.annotations.Ignore;
import lesson12.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
  Calculator calc;

  @BeforeEach
  void initialize() {
    calc = new Calculator();
  }

  @Test
  @DisplayName("Product of 0")
  void baseProd() {
    assertEquals(0, calc.prod(0, 0));
    assertEquals(0, calc.prod(5, 0));
    assertEquals(0, calc.prod(0, 5));
  }

  @Test
  @DisplayName("Product of simple digits")
  void simpleProd() {
    assertEquals(6, calc.prod(2, 3));
    assertEquals(-6, calc.prod(2, -3), "-6 = 2 * -3");
    assertEquals(-6, calc.prod(-2, 3));
    assertEquals(6, calc.prod(2, 3));
  }

  @RepeatedTest(5)
//  @Ignore
//  @EnabledOnJre(JRE.JAVA_8)
  void repTest() {
    assertEquals(1, calc.prod(1, 1));
  }

  @Test
  void zeroDivision() {
    Throwable t = assertThrows(ArithmeticException.class, () -> calc.div(5, 0));
    assertEquals("/ by zero", t.getMessage());
  }
}

package lesson7;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/*
Создать файл numbers.txt, в котором должен быть набор чисел (целых и дробных),
разделенных пробельными символами (пробелы/табуляции/новые строки)
С помощью Scanner и FileInputStream прочесть все числа из файла
и вывести их среднее арифметическое с тремя знаками после запятой, используя System.out.printf
P.S. В файле могут встретиться не числа, их нужно пропустить
Пример входного файла
" 1 2,5 -2 asd 43e
hhf 6,5"
Результат операции в консоли: 2.000
 */
public class HW3 {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(new FileInputStream("./src/lesson7/numbers.txt"))) {
      int count = 0;
      double sum = 0;

      while (sc.hasNext()) {
        if (sc.hasNextInt()) {
          sum += sc.nextInt();
          count += 1;
        } else if (sc.hasNextDouble()) {
          sum += sc.nextDouble();
          count += 1;
        } else {
          sc.next();
        }
      }

      System.out.printf("%.3f\n", sum / count);
    } catch (IOException ex) {
      System.out.println("Ошибка ввода/вывода");
    }
  }
}

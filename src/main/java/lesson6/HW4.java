package lesson6;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Спросить у пользователя два целых числа x и y и вывести результат Math.sqrt(x) / Math.sqrt(y) на экран
Обработать (с помощью try..catch) два возможных исключения InputMismatchException и ArithmeticException
В случае InputMismatchException сообщить пользователю "Вы ввели не целые числа, попробуйте снова"
В случае ArithmeticException сообщить "Деление на ноль, нет ответа"
 */
public class HW4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      int x = sc.nextInt();
      int y = sc.nextInt();

      System.out.println(x / y);
      System.out.println(Math.sqrt(x) / Math.sqrt(y));
    } catch (ArithmeticException ex) {
      System.out.println("Деление на ноль, нет ответа");
    } catch (InputMismatchException ex) {
      System.out.println("Вы ввели не целые числа, попробуйте снова");
    }
  }
}

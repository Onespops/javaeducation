package lesson6;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Создать свое собственное исключение: класс InputNotPositiveException, наследник InputMismatchException
Внутри класса с помощью генерации кода добавить пустой конструктор

В psvm добавить код из HW4, но после считывания x и y из консоли добавить код,
проверяющий является ли хотя бы один из них числом <= 0
Если да, то бросить (ключевое слово throw) новое исключение InputNotPositiveException
Добавить ещё один блок catch, который должен обработать это исключение
  и вывести пользователю строку "Вы ввели неположительное число, попробуйте снова"
 */
public class HW5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      int x = sc.nextInt();
      int y = sc.nextInt();

      if (x <= 0 || y <= 0) {
        throw new InputNotPositiveException();
      }

      System.out.println(x / y);
      System.out.println(Math.sqrt(x) / Math.sqrt(y));
    } catch (ArithmeticException ex) {
      System.out.println("Деление на ноль, нет ответа");
    } catch (InputNotPositiveException ex) {
      System.out.println("Вы ввели неположительное число, попробуйте снова");
    } catch (InputMismatchException ex) {
      System.out.println("Вы ввели не целые числа, попробуйте снова");
    }
  }
}

package lesson3;

import java.util.Scanner;

/*
Внутри класса HW2 создать три метода:
метод add, который принимает два целых числа как аргументы и возвращает их сумму
метод prod, который принимает два целых числа как аргументы и возвращает их произведение
метод negative, который принимает целое число и возвращает его же, умноженное на -1 (то есть меняет знак)
в psvm спросить у пользователя три числа a, b, c
и с помощью методов add, prod и negative вывести в консоль результат выражения -c * (a + b)
P.S. Внутри sout можно пользоваться только методами, операциями "+", "*" и "-" нельзя
 */
public class HW2 {
  static int add(int x, int y) {
    return x + y;
  }

  static int prod(int x, int y) {
    return x * y;
  }

  static int negative(int x) {
    return -x;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    // -c * (a + b)
    // -c * add(a, b)
    // 1 вариант
    //  negative(c) * add(a,b)
    //  prod(negative(c), add(a, b))
    // 2 вариант
    //  -prod(c, add(a, b)
    //  negative(prod(c, add(a, b)))
    System.out.println(prod(negative(c), add(a, b)));

  }
}

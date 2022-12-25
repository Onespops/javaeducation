package lesson8;

import java.util.HashSet;
import java.util.Scanner;

/*
Спросить у пользователя целое число N
Спросить у пользователя N целых чисел и вывести все уникальные числа среди них
P.S. Использовать одну из структур данных с занятия учитывая необходимость в уникальности элементов
Примеры
Ввод:
  4
  1 1 2 2
Вывод:
  [1, 2]
Ввод:
  6
  1 2 3 4 5 5
Вывод:
  [1, 2, 3, 4, 5]
 */
public class HW2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    HashSet<Integer> unicInts = new HashSet<>();
    for (int i = 0; i < n; i++) {
      unicInts.add(sc.nextInt());
    }

    System.out.println(unicInts);
  }
}

package lesson2;

import java.util.Arrays;
import java.util.Scanner;

/*
Спросить у пользователя целое положительное число
Создать целочисленный массив такой же длины
С помощью цикла (for или while) заполнить этот массив по правилу:
Каждый элемент равен его индексу, умноженному на 11
После заполнения, вывести массив
Например, если пользователь введет 6, то должен получиться массив [0, 11, 22, 33, 44, 55]
 */
public class HW4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите длину массива");
    int len = sc.nextInt();
    int[] arrInt = new int[len];

    for (int i = 0; i < arrInt.length; i++) {
      arrInt[i] = i * 11;
    }
    System.out.println(Arrays.toString(arrInt));
  }
}

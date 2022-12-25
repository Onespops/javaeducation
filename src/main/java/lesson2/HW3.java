package lesson2;

import java.util.Scanner;

/*
Спросить у пользователя одно целое число типа int
С помощью цикла while вывести столько же раз фразу "Цикл while"
 */
public class HW3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    while (num > 0) {
      System.out.println("Цикл while");
      num--;
    }

  }
}

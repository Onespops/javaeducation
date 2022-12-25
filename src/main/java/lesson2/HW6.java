package lesson2;

import java.util.Scanner;

/*
Спросить у пользователя целое число N
создать треугольник высотой N
(возможно запускать цикл в цикле)
Пример: N = 5               N = 3
*                           *
**                          **
***                         ***
****
*****
 */
public class HW6 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();

    for (int rowNum = 1; rowNum <= N; rowNum++) {
      for (int starCount = 0; starCount < rowNum; starCount++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

package lesson2;

import java.util.Scanner;

/*
Спросить у пользователя число с помощью Scanner
Если оно попадает в диапазон от 1 до 100 или в диапазон от -1000 до -100, вывести в консоль "+"
Если оно не попадает ни в один из этих диапазонов, вывести "-"
 */
public class HW1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    if ((num >= 1 && num <= 100) || (num >= -1000 && num <= -100)) {
      System.out.println("+");
    } else {
      System.out.println("-");
    }

    if (num >= 1 && num <= 100) {
      System.out.println("+");
    } else if (num >= -1000 && num <= -100) {
      System.out.println("+");
    } else {
      System.out.println("-");
    }
  }
}

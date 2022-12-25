package lesson1;

/*
Создать переменную number целого типа int с каким-нибудь значением
Положить в number результат формулы ((number+3) * 123 - number) * 45
В случае, если получилось число больше 1000000, вывести "Большое число"
В обратном случае, вывести "Небольшое число"
 */
public class HW2 {

  public static void main(String[] args) {
    int number = 100;
    number = ((number + 3) * 123 - number) * 45;

    if (number > 1000000) {
      System.out.println("Большое число");
    } else {
      System.out.println("Небольшое число");
    }
    System.out.println(number);
  }
}
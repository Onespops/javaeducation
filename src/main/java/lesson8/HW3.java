package lesson8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*
Спросить у пользователя целое число N
Спросить у пользователя N целых чисел и вывести информацию о том сколько раз каждое число было введено
P.S. Использовать одну из структур данных с занятия
 учитывая необходимость хранения информации о наборе чисел и о частоте каждого числа
Примеры
Ввод:
  4
  1 1 2 2
Вывод:
  {1=2, 2=2}
Ввод:
  6
  1 2 3 4 5 5
Вывод:
  {1=1, 2=1, 3=1, 4=1, 5=2}
 */
public class HW3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    HashMap<Integer, Integer> freqs = new HashMap<>();
    // 1 вариант
    for (int i = 0; i < n; i++) {
      int newInt = sc.nextInt();
      if (!freqs.containsKey(newInt)) {
        freqs.put(newInt, 1);
      } else {
        int oldFreq = freqs.get(newInt);
        freqs.put(newInt, oldFreq + 1);
      }
    }

    // 2 вариант
//    for (int i = 0; i < n; i++) {
//      int newInt = sc.nextInt();
//      if (!freqs.containsKey(newInt)) {
//        freqs.put(newInt, 0);
//      }
//      freqs.put(newInt, freqs.get(newInt) + 1);
//    }

    // 3 вариант
//    for (int i = 0; i < n; i++) {
//      int newInt = sc.nextInt();
//      freqs.put(newInt, freqs.getOrDefault(newInt, 0) + 1);
//    }

    System.out.println(freqs);
  }
}

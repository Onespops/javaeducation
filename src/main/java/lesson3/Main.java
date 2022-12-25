package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  // выходное_значение имя_метода (перечисление_параметров) { блок_кода }
  static void printSomething() {
    System.out.println("первая строка в метода");
    System.out.println("Вторая строка в методе");
    System.out.println("Последняя строка в методе");
  }

  // входные данные - аргументы
  static void printAdd(int a, int b) {
    System.out.println(a + b);
  }

  static void first() {
    System.out.println("start first");
    int x = 1;
    System.out.println(x);
    second();
    System.out.println("end first");
  }

  static void second() {
    System.out.println("start second");
    int x = 10;
    System.out.println(x);
    third();
    System.out.println("end second");
  }

  static void third() {
    System.out.println("start third");
    int x = 100;
    System.out.println(x);
    System.out.println("end third");
  }

  static int add(int a, int b) {
    return a + b;
  }

  static double prodDouble(double q, double w, double e) {
    return q * w * e;
  }

  static String strN(String str, int n) {
    if (n < 0) {
      return null;
    }
    String res = "";
    for (int i = 0; i < n; i++) {
      res += str;
    }
    return res;
  }

  static double[] arrN(double[] doubles, int n) {
    return null;
  }


  static void changeU() {
//    u = 2;
    int l = 123;
  }

  static void continueOperator() {
    // оператор continue
    for (int i = 0; i < 7; i++) {
      System.out.println(i);
      if (i == 3) {
        continue;
      }
      System.out.println("Конец цикла для числа " + i);
    }

    for (int i = 0; i < 7; i++) {
      System.out.println(i);
      if (i != 3) {
        System.out.println("Конец цикла для числа " + i);
      }
    }
  }

  static void breakOperator() {
    for (int i = 0; i < 7; i++) {
      System.out.println(i);
      if (i == 3) {
        break;
      }
      System.out.println("Конец цикла для числа " + i);
    }
    System.out.println("После цикла");
  }

  public static void main(String[] args) {
    // continue и break
    // оператор continue
//    continueOperator();
    // оператор break
//    breakOperator();

    Scanner sc = new Scanner(System.in);
//    int i = 0;
//    while (true) {
//      int x = sc.nextInt();
//      if (x == 0) {
//        break;
//      }
//      i += x;
//    }
//    System.out.println("сумма чисел ввода = " + i);

    // Вложенные циклы
//    for (int i = 0; i < 5; i++) {
//      for (int j = 10; j < 15; j++) {
//        System.out.println(i + " " + j);
//      }
//    }

    // Многомерные массивы (multidimensional arrays)
//    int[][] matrix = new int[4][5];
//    System.out.println(Arrays.toString(matrix));
//    for (int i = 0; i < matrix.length; i++) {
//      System.out.println(Arrays.toString(matrix[i]));
//    }
//
//    for (int row = 0; row < matrix.length; row++) {
//      for (int col = 0; col < matrix[row].length; col++) {
//        matrix[row][col] = row * 5 + col;
//      }
//    }
//
//    System.out.println("После заполнения");
//    for (int i = 0; i < matrix.length; i++) {
//      System.out.println(Arrays.toString(matrix[i]));
//    }

    // Методы (подпрограммы) - именованный блок кода с входными и выходными данными

//    for (int i = 0; i < 3; i++) {
//      printSomething();
//    }

//    printAdd(3,4);
//    printAdd(3, 4.5); // проверка на тип аргументов
//    printAdd(3); // проверка на количество
//    printAdd(3,4,5);

//    int x = sc.nextInt();
//    int y = sc.nextInt();
//    printAdd(x, y);

    // Стек вызова функций
//    first();

    // выходные значения
//    int z = add(x, y);
//    System.out.println(z);
//    System.out.println(z + 1);

    // task1
    /*
    Определить метод prodDouble, который принимает как аргументы 3 числа double
    и возвращает (return) результат перемножения этих значений
    Проверьте что он работает -
    выведите результат работы метода с тремя double значениями
     */
//    double g = sc.nextDouble();
//    double h = sc.nextDouble();
//    double j = sc.nextDouble();
//    System.out.println(prodDouble(g, h, j));

    // task2
    /*
    Определить метод strN, который принимает строку string и целое число n
    и возвращает строку, которая состоит из повторения string n раз
    (похоже на алгоритмы суммы в массиве)
    Например:
    int n = 3;
    String s = "hello";
    String sTripled = strN(s, n);
    System.out.println(sTripled); // "hellohellohello"
    System.out.println(strN(s, 0)); // ""
     */
//    int n = sc.nextInt();
//    String s = "hello";
//    String sTripled = strN(s, n);
//    System.out.println(sTripled); // "hellohellohello"
//    System.out.println(strN(s, 0)); // ""

    // task3
    /*
    Изменить код strN так, что если n < 0, метод возвращает null
     */

    // task4 (*)
    /*
    Определить метод arrayN, который принимает массив дробных чисел и целое число n
    и возвращает массив, состоящий из n повторений первого аргумента
    Например если double[] doubleArr = new double[]{1,2,3}
    То arrayN(doubleArr, 3) -> {1,2,3,1,2,3,1,2,3}
    И arrayN(doubleArr, 0) -> {}
     */

    // Области видимости переменных
    // Переменная видна только в блоке в котором она создана
    // (плюс внутри вложенных блоков у if..else, while, for)
    int u = 5;
    if (u > 4) {
      u = 4;
      int o = 0;
    }
//    o = 1;

    changeU();
//    l = 124;

    // Передача аргументов по значению и по ссылке
    int k = 123;
    System.out.println("k before changeInt = " + k);
    changeInt(k);
    System.out.println("k after changeInt = " + k);
    k = changeIntReal(k);
    System.out.println("k after changeIntReal = " + k);

    int[] kArr = new int[]{123};
    System.out.println("kArr before changeInt = " + Arrays.toString(kArr));
    changeArr(kArr);
    System.out.println("kArr after changeInt = " + Arrays.toString(kArr));
  }

  static void changeArr(int[] x) {
    System.out.println("x inside changeInt before change = " + Arrays.toString(x));
    x[0] = 100;
    System.out.println("x inside changeInt after change = " + Arrays.toString(x));
  }

  static void changeInt(int x) {
    System.out.println("x inside changeInt before change = " + x);
    x = 100;
    System.out.println("x inside changeInt after change = " + x);
  }

  static int changeIntReal(int x) {
    return x + 100;
  }























}

package lesson4;

import java.util.Arrays;

/*
Создать массив дробных чисел (значения должны быть в диапазоне -1..1)
С помощью цикла for и методов из Math заменить каждый элемент на значение его синуса
Вывести в консоль массив в отсортированном виде (для этого использовать метод sort() из Arrays)
 */
public class HW1 {

  public static void main(String[] args) {
    double[] doubleArr = new double[]{0.1, 0.6, 0.0, 1.0, -1.0, -0.5};

    for (int i = 0; i < doubleArr.length; i++) {
      doubleArr[i] = Math.sin(doubleArr[i]);
    }
    Arrays.sort(doubleArr);
    System.out.println(Arrays.toString(doubleArr));
  }
}

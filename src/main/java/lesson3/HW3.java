package lesson3;

import java.util.Arrays;

/*
Внутри класса HW3 создать метод doubleElements, который принимает массив double значений
и каждый элемент внутри этого массива удваивает
У метода не должно быть выходного значения
В psvm создать переменную, хранящую массив любого количества любых double значений,
вывести изначальный массив в консоль,
вызвать метод doubleElements для этого массива,
вывести получившийся массив в консоль
 */
public class HW3 {
  static void doubleElements(double[] doubles) {
    for (int i = 0; i < doubles.length; i++) {
//      doubles[i] = doubles[i] * 2;
      doubles[i] *= 2;
    }
  }

  public static void main(String[] args) {
    double[] doubleArray = new double[]{2, 4, 5, 10, -2};
    System.out.println(Arrays.toString(doubleArray));
    doubleElements(doubleArray);
    System.out.println(Arrays.toString(doubleArray));
  }
}

package lesson3;

import java.util.Arrays;

/*
Определить метод arrayN, который принимает массив дробных чисел и целое число n
и возвращает массив, состоящий из n повторений первого аргумента
Например если double[] doubleArr = new double[]{1,2,3}
То arrayN(doubleArr, 3) -> {1,2,3,1,2,3,1,2,3}
И arrayN(doubleArr, 0) -> {}
 */
public class HW4 {
  static double[] arrayN(double[] in, int n) {
    double[] result = new double[in.length * n];
    
    // 1 вариант
//    for (int newIndex = 0; newIndex < result.length; newIndex++) {
//      result[newIndex] = in[newIndex % in.length];
//    }
    // 2 вариант
    for (int i = 0; i < n; i++) {
      for (int inIndex = 0; inIndex < in.length; inIndex++) {
        result[i * in.length + inIndex] = in[inIndex];
      }
    }
    return result;
  }
  
  public static void main(String[] args) {
    double[] doubleArr = new double[]{1,2,3};
    System.out.println(Arrays.toString(arrayN(doubleArr, 3)));
    System.out.println(Arrays.toString(arrayN(doubleArr, 2)));
    System.out.println(Arrays.toString(arrayN(doubleArr, 0)));
  }
}

package lesson7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Создать текстовый файл hw12.txt со смешанным содержанием (цифры, буквы разных алфавитов, спецсимволы)
С помощью потоков байт FileInputStream и FileOutputStream создать копию этого файла hw12_copy.txt
В время копирования подсчитать количество операций копирования байта
(т.е. подсчитать размер исходного файла в байтах)
После копирования вывести фразу "Файл скопирован, всего скопировано %d байт"
В случае любой ошибки чтения/записи (IOException) вывести "Ошибка чтения/записи"
 */
public class HW1 {

  public static void main(String[] args) {
    try (FileInputStream in = new FileInputStream("./src/lesson7/hw12.txt");
         FileOutputStream out = new FileOutputStream("./src/lesson7/hw12_copy.txt")) {
      int count = 0;
      int b = in.read();
      while (b != -1) {
        count += 1;
        out.write(b);
        b = in.read();
      }
      System.out.printf("Файл скопирован, всего скопировано %d байт\n", count);
    } catch (IOException ex) {
      System.out.println("Ошибка чтения/записи");
    }
  }

}

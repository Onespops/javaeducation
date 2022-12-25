package lesson7;

import java.io.*;

/*
Выполнить такую же операцию, как и в HW1,
только сделать это с помощью потоков символов (FileReader и FileWriter)
Подсчитывать вместо количества скопированных байт количество скопированных символов
Итоговая строка "Файл скопирован, всего скопировано %d символов"
В случае ошибки чтения/записи вывести сообщение неизменно
 */
public class HW2 {

  public static void main(String[] args) {
    try (FileReader in = new FileReader("./src/lesson7/hw12.txt");
         FileWriter out = new FileWriter("./src/lesson7/hw12_copy.txt")) {
      int count = 0;
      int b = in.read();
      while (b != -1) {
        count += 1;
        out.write(b);
        b = in.read();
      }

      System.out.printf("Файл скопирован, всего скопировано %d символов\n", count);
    } catch (IOException ex) {
      System.out.println("Ошибка чтения/записи");
    }
  }
}

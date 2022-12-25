package lesson7;

import java.io.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  static void byteStreams1() {
    // Потоки ввода/вывода - возможность считать или записать информацию из/в источник данных
    // Потоки байт - потоки ввода/вывода двоичных данных
    try {
      FileInputStream in = new FileInputStream("byte.txt");
      int i = in.read();
      while (i != -1) {
        System.out.println(i + " " + (char) i);
        i = in.read();
      }
//      in.reset(); // сброс курсора в начало файла

      in = new FileInputStream("byte.txt");
      byte[] bytes = new byte[4];
      in.read(bytes);
      System.out.println(Arrays.toString(bytes));

      in.close(); // закрытие ресурса
//      System.out.println(in.read());
    } catch (FileNotFoundException e) {
      System.out.println("file not found " + e.getMessage());
    } catch (IOException e) {
      System.out.println("ioexception " + e.getMessage());
    }
  }

  static void byteStreams2() {
    // Потоки ввода/вывода - возможность считать или записать информацию из/в источник данных
    // Потоки байт - потоки ввода/вывода двоичных данных
    try {
      FileInputStream in = new FileInputStream("byte.txt");
      FileOutputStream out = new FileOutputStream("byte_copy.txt");

      int i = in.read();
      while (i != -1) {
        out.write(i);
        i = in.read();
      }
//      out.write(new byte[]{49, 105, 50});
      in.close();
      out.close();
    } catch (FileNotFoundException e) {
      System.out.println("file not found " + e.getMessage());
    } catch (IOException e) {
      System.out.println("ioexception " + e.getMessage());
    }
  }

  static void goodTryStreams() {
    FileInputStream in = null;
    FileOutputStream out = null;
    try {
      in = new FileInputStream("byte.txt");
      out = new FileOutputStream("byte_copy.txt");

      int i = in.read();
      while (i != -1) {
        out.write(i);
        i = in.read();
      }
    } catch (FileNotFoundException exception) {
      exception.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (in != null) {
          in.close();
        }
        if (out != null) {
          out.close();
        }
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
    }
  }

  // с помощью FileInputStream, FileOutputStream скопировать файл
  static void tryWithResources() {
    try (FileInputStream in = new FileInputStream("123.svg.webp");
         FileOutputStream out = new FileOutputStream("1234.svg.webp");
         CloseableExample ce = new CloseableExample()) {
      int i = in.read();
      while (i != -1) {
        out.write(i);
        i = in.read();
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  // с помощью FileReader, FileWriter скопировать текстовый файл кроме букв 'f'
  // char тип данных можно сравнивать с помощью ==, <, > и т.д.
  static void charStreams() {
    try (FileReader in = new FileReader("chars.txt");
         FileWriter out = new FileWriter("chars_copy.txt")) {
      int i = in.read();
      while (i != -1) {
        char gotChar = (char) i; // Полученный символ
        System.out.println(i + " " + gotChar);
        out.write(i);
        i = in.read();
      }
      out.write("\nКонец");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  static void copyWithoutF() {
    try (FileReader in = new FileReader("withF.txt");
         FileWriter out = new FileWriter("withoutF.txt")) {
      int i = in.read();
      while (i != -1) {
        if (i != 'f') {
          out.write(i);
        }
        i = in.read();
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  static void bufferedStreams() {
    // Буферизированные потоки ввода/вывода - работа с данными через буфер
    // Буфер - место под данные/данные, находящиеся в оперативной памяти
    try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("byte.txt"), 1024);
         BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("byte_copy.txt"));
         BufferedReader in1 = new BufferedReader(new FileReader("chars.txt"));
         BufferedWriter out1 = new BufferedWriter(new FileWriter("chars_copy.txt"))) {
      int i = in.read();
      while (i != -1) {
        out.write(i);
        i = in.read();
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  static void objectStreams() {
    // Потоки ввода/вывода объектов (сериализация/десериализация)
    Person p = null;
    Person p2 = null;
    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person"))) {
      p = new Person("Andrew", "123asd", 23);
      out.writeObject(p);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person"))) {
      p2 = (Person) in.readObject();
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println(p);
    System.out.println(p2);

    System.out.println(p.hashCode());
    System.out.println(p2.hashCode());
  }

  static void scanner() {
    try (Scanner scFile = new Scanner(new FileInputStream("numbers.txt"));
         FileWriter out = new FileWriter("numbers_redacted.txt")) {
      while (scFile.hasNext()) {
        if (scFile.hasNextInt()) {
          int i = scFile.nextInt();
          System.out.println("int " + i);
          out.write("int " + i + "\n");
        } else if (scFile.hasNextDouble()) {
          double d = scFile.nextDouble();
          System.out.println("double " + d);
          out.write("double " + d + "\n");
        } else {
          String word = scFile.next();
          System.out.println("word " + word);
          out.write("word " + word + "\n");
        }
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    sc.nextLine();
    String name = sc.nextLine();
    System.out.println(age + " " + name);
  }

  static void formattedOutput() {
    long id = 1;
    String name = "andrew";
    String password = "123";
    int age = 23;
    System.out.println("Person{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", password='" + password + '\'' +
        ", age=" + age +
        '}');

    System.out.printf("%s{id=%d, name='%s', password='%s', age=%d}\n", "Person", id, name, password, age);

    System.out.printf("%10.3f\n", 4.123523);

    System.out.printf(Locale.CANADA, "%10.3f\n", 4.123523);

    System.out.printf("%tb\n", new Date());
    System.out.printf(Locale.CANADA, "%tb\n", new Date());
    System.out.printf(Locale.getDefault(), "%tb\n", new Date());
  }

  public static void main(String[] args) {
    // StreamsIO
//    byteStreams1();
//    byteStreams2();
//    goodTryStreams();
//    tryWithResources();
//    charStreams();
//    copyWithoutF();
//    bufferedStreams();
//    objectStreams();
//    scanner();
    formattedOutput();
  }
}

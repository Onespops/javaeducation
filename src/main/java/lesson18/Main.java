package lesson18;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  static void abs() {
    String m = "Hello";
    System.out.println(m);
    abc(m);
    System.out.println(m);
  }

  static void abc(String m) {
    m = "world";
  }

  private static void doSomethingWithWhere(String whereIn) {
    // действия с whereIn
    whereIn = whereIn + "; drop TABLE users;";
  }

  private static boolean checkSql(String whereIn) {
    return !whereIn.contains(";");
  }

  static void immutable() {
//    String q = "Hello";
//    System.out.println(q);
//    String q2 = "Hello";
//    System.out.println(q2);
//
//    final String LOGIN = "Andrew";
//    final String PASS = "123asd";
//
//    Scanner sc = new Scanner(System.in);
//    String loginIn = sc.next();
//    String passIn = sc.next();
//    sc.nextLine();
//    String whereIn = sc.nextLine();
//    if (loginIn.equals(LOGIN) && passIn.equals(PASS) && checkSql(whereIn)) {
//      System.out.println("Делаю действия с условиями: " + whereIn);
//      doSomethingWithWhere(whereIn);
//    } else if (!loginIn.equals(LOGIN)){
//      System.out.println("Неверный логин");
//    } else if (!passIn.equals(PASS)) {
//      System.out.println("Неверный пароль");
//    } else {
//      System.out.println("Пишете опасное условие where");
//    }

    StringBuilder s = new StringBuilder();
    for (int i = 0; i < 1000000; i++) {
      s.append(i);
    }
    System.out.println(s);

    String s1 = s.toString();
    s1 = s1.replace("1", "_");
  }

  static void datetime() {
    // java.util работа со временем
    Date now = new Date();
    System.out.println(now);
    Date then = new Date(1000);
    System.out.println(then);

    System.out.println(now.getTime());
    System.out.println(now.after(then));
    System.out.println(now.before(then));

    SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
    System.out.println(sdf.format(now));

    // java.sql классы, наследующиеся от java.util.Date
    java.sql.Date d = new java.sql.Date(1000);
    System.out.println(sdf.format(d));
    java.sql.Timestamp ts = new Timestamp(1000);

    // существует "правильный" вариант работы с временем - пакет java.time
  }

  static void enums() {
    DaysOfTheWeek dayFromEnum = DaysOfTheWeek.TUESDAY;
    if (dayFromEnum == DaysOfTheWeek.MONDAY) {
      System.out.println("1");
    } else {
      System.out.println("2");
    }

    DaysOfTheWeekClass dayFromClass = new DaysOfTheWeekClass(DaysOfTheWeekClass.MONDAY);
  }

  static void annotationExample() {
    Field[] fields = CustomAnnoExample.class.getDeclaredFields();
    for (Field f : fields) {
      if (f.isAnnotationPresent(CustomAnnotation.class)) {
        CustomAnnotation annotation = f.getAnnotation(CustomAnnotation.class);
        System.out.printf("%s name=%s\n",
            annotation.type()==0?"Field":"Method",
            annotation.name());
      }
    }

    Method[] methods = CustomAnnoExample.class.getDeclaredMethods();
    for (Method m : methods) {
      if (m.isAnnotationPresent(CustomAnnotation.class)) {
        CustomAnnotation annotation = m.getAnnotation(CustomAnnotation.class);
        System.out.printf("%s name=%s\n",
            annotation.type()==0?"Field":"Method",
            annotation.name());
      }
    }

  }

  public static void main(String[] args) {
//    abs();
//    immutable();
//    datetime();
    annotationExample();
  }
}

package lesson8;

import java.util.ArrayList;

/*
Создать список (ArrayList или LinkedList) строк
Положить туда сколько угодно цветов с помощью метода add()
Вывести на экран список (через sout)
Удалить цвет "Синий"
Вывести на экран список
Удалить второй по индексу цвет с помощью метода remove()
Вывести на экран список
Добавить удаленные цвета обратно в начало списка с помощью метода add()
Вывести на экран список
*/
public class HW1 {

  public static void main(String[] args) {
    ArrayList<String> colors = new ArrayList<>();

    colors.add("Красный");
    colors.add("Синий");
    colors.add("Фиолетовый");
    colors.add("Белый");
    colors.add("Черный");
    colors.add("Зеленый");
    colors.add("Оранжевый");
    System.out.println(colors);

    colors.remove("Синий");
    System.out.println(colors);

    String deletedColor = colors.remove(2);
    System.out.println(colors);

    colors.add(0, "Синий");
    colors.add(0, deletedColor);
    System.out.println(colors);
  }
}

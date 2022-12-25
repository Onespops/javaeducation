package lesson6;

/*
Создать класс Plane, реализующий интерфейсы Printable и Flying
Поля:
  строка manufacturer
  строка model
  дробное число speedMph
Конструкторы:
  без аргументов (заполняет строковые поля пустыми строками "")
  со всеми аргументами
Методы:
  print выводит всю информацию о самолете в консоль
    (при этом переводит speedMph из миль/ч в км/ч с помощью константы MPH_TO_KMH из Flying)
  travel расчитывает расстояние в километрах, которое пролетит самолет если будет лететь time часов
    (аналогично с print необходимо переводить speedMph в км/ч)
 */
public class HW2 {

  public static void main(String[] args) {
    Plane p = new Plane("Boeing", "747", 300);
    p.print();
    System.out.println(p.travel(10));

    Plane p2 = new Plane();
    p2.print();
  }
}

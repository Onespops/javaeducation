package lesson4;

/*
Добавить в класс PhoneNumber два конструктора:
первый - без аргументов, он задает значение numType = ""
второй - с двумя аргументами таких же типов, что и поля, он передает значения аргументов в поля
В psvm создать два объекта класса PhoneNumber
    первый - с помощью конструктора без аргументов и потом задать значения его полей
    второй - с помощью конструктора с двумя аргументами
Вывести информацию об обоих объектах по одному на строку
 */
public class HW3 {

  public static void main(String[] args) {
    PhoneNumber pn1 = new PhoneNumber();
    pn1.numType = "Мобильный";
    pn1.num = 89991231212L;

    PhoneNumber pn2 = new PhoneNumber("Домашний", 89991234567L);

    System.out.println(pn1.numType + " " + pn1.num);
    System.out.println(pn2.numType + " " + pn2.num);
  }
}

package lesson4;

/*
Добавить в класс PhoneNumber три метода:
метод с именем print без аргументов и без возвращаемого значения,
    print выводит объект в консоль в одну строку
метод с именем changeType с одной строкой как аргумент и без возвращаемого значения,
    changeType изменяет значение поля numType на строку из аргумента
метод с именем getNum без аргументов и с возвратом целочисленного значения,
    getNum возвращает значение поля num
В psvm создать объекты как в HW3
Вызвать у второго объекта метод print(),
с помощью sout и getNum() вывести отдельно значение номера,
вызвать у объекта changeType() со значением строчного типа,
снова вызвать метод print()
 */
public class HW4 {

  public static void main(String[] args) {
    PhoneNumber pn1 = new PhoneNumber();
    pn1.numType = "Мобильный";
    pn1.num = 89991231212L;

    PhoneNumber pn2 = new PhoneNumber("Домашний", 89991234567L);

    pn2.print();
    System.out.println("pn2.num = " + pn2.getNum());
    pn2.changeType("Мобильный");
    pn2.print();
  }
}

package lesson4;

/*
Создать класс PhoneNumber (в отдельном файле)
2 поля:
num целочисленного типа
    (там будет храниться номер в виде числа, начинающегося с 8)
numType строчного типа
    (там будет храниться информация о типе номера, например "Рабочий" или "Личный")
В psvm создать объект класса PhoneNumber, задать его полям значения через операцию присваивания
Вывести информацию об объекте в консоль в одну строку
 */
public class HW2 {

  public static void main(String[] args) {
    PhoneNumber pn = new PhoneNumber();
    pn.numType = "Мобильный";
    pn.num = 89991231212L;

    System.out.println(pn.numType + " " + pn.num);
  }

}

package lesson5;

public class Main {

  static void abstraction() {
    // Абстракция
    // 1. Отделение нужных признаков и поведения от ненужных в момент построения класса
    // 2. Пользователь не обязан знать внутреннее устройство класса для того чтобы с ним работать
  }

  static void polymorphism() {
    // Полиморфизм - возможность работы метода с разными типами данных
    // 1. "Истинный" полиморфизм - один код под разные наборы типов данных
    // 2. "Мнимый" полиморфизм (ad-hoc) - разный код под разные наборы типов данных
    // 2.1. Приведение типов - если не подходит один из аргументов по типу, java его попробует привести к нужному
    System.out.println(add(1.0, 3));
    // 2.2. Перегрузка (overload) - возможность создать несколько методов с одним именем, но разными наборами аргументов
    System.out.println(add("123", "asd"));
  }

  static int add(int x, int y) {
    return x + y;
  }

  static double add(double x, double y) {
    return x + y;
  }

  static String add(String x, String y) {
    return x + y;
  }

  static void inheritance() {
    // Наследование - возможность создать класс на основе другого класса
    // Все поля и методы класса-родителя будут доступны и в классе-потомке
    // Ни один конструктор родителя не доступен в потомке
    // наследование описывается в определении класса с помощью ключевого слова extends
//    Parrot p0 = new Parrot();
    Parrot p = new Parrot("Василий", 15, 1.5);
//    p.name = "Василий";
//    p.age = 15;
//    p.wingsLength = 1.5;
    p.print();
    p.birthday();
    p.print();
    p.flapWings();

    Animal a = new Animal("Иван", 4);
    a.print();
    // Невозможно наследоваться больше чем от одного класса

    // Ключевое слово this - ссылка на объект
    // Ключевое слово super - ссылка на родителя
  }

  static void encapsulation() {
    // Инкапсуляция
    // 1. Помещение данных и действий над данными в одну "капсулу"
    // 2. Сокрытие одних частей программы от других

    // Модификаторы доступа
    // private - данная часть класса доступна ТОЛЬКО внутри класса
    // default - данная часть класса доступна внутри пакета
    // protected - данная часть класса доступна внутри пакета И наследникам (даже в других пакетах)
    // public - данная часть класса доступна всем
  }

  static void settersGetters() {
    Parrot p = new Parrot();
    p.setWingsLength(1.7);
    System.out.println(p.getWingsLength());
  }

  static void task1() {
    /*
    Создать класс Figure. У него:
      2 поля: double x, double y
      2 конструктора: пустой и с обоими полями
      2 метода:
        print(), выводящий x и y через пробел;
        move(double newX, double newY), изменяющий значения x и y на newX и newY соответственно
     */
    Figure f = new Figure(1, 3.5);
    f.print();
    f.move(-1, -2);
    f.print();
  }

  static void task2() {
    /*
    Создать класс Circle - наследник Figure. У него:
      1 дополнительное поле: double radius
      2 конструктора: пустой и со всеми 3 полями (x, y, radius)
      метод print() изменен так, что выводит x, y, radius через пробел
      еще один метод length(), который выводит на экран длину окружности (формула = 2 * Math.PI * radius)
     */
    Circle c = new Circle(4, 9.1, 3);
    c.print();
    c.move(-1, -2.1);
    c.print();
    c.length();
  }

  static void objectClass() {
    // Существует класс - общий предок всех классов: класс Object
    // Класс Object имеет методы, необходимые для всех классов Java
    // Метод toString() - задает правило преобразования объекта в строчку
    Figure f = new Figure(2, 3.5);
    System.out.println(f.toString());
    System.out.println(f);

    // Метод equals() - используется для проверки равенства объектов
    // используется вместо "==", потому что "==" проверяет равенство ссылок, а не значений
    Circle c1 = new Circle(0, 0, 5);
    Circle c2 = new Circle(0, 0, 5);
    System.out.println(c1 == c2);
    System.out.println(c1.equals(c2));

    // hashcode() - генерация уникального числа
    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());

    // Метод getClass() - получение информации о классе объекта
    System.out.println(c1.getClass());
    System.out.println(c2.getClass());
    System.out.println(c1.getClass().equals(c2.getClass()));
    System.out.println(c1.getClass().getName());
    System.out.println(c1.getClass().getSimpleName());

    // Рефлексия
    System.out.println(c1.getClass().getFields()[0]);
    System.out.println(c1.getClass().getFields()[1]);
  }

  static void finalKeyword() {
    // final переменные - после инициализации нельзя изменить значение
    final int i = 8;
    System.out.println(i);
//    i = 9;
    final int j;
    j = -8;
    System.out.println(j);
//    j = -10;
    // final поля - после первоначального задания значения нельзя изменить значение
    FinalExample fe1 = new FinalExample(2);
    System.out.println(fe1.a + " " + fe1.b);
    FinalExample fe2 = new FinalExample(222);
    System.out.println(fe2.a + " " + fe2.b);
//    fe1.a = -2;
//    fe1.b = -8;
//    fe2.a = -222;
//    fe2.b = -8;
    // final методы - метод нельзя переопределить
    // final классы - от класса нельзя наследоваться
  }

  static void abstractKeyword() {
    // abstract - ключевое слово
    // abstract класс - класс у которого нельзя создать объект
    // abstract метод - метод, который НЕОБХОДИМО переопределить в наследниках
    // абстрактный класс нужен в том случае, если в предметной области не подразумевается объектов этого класса
//    ChessFigure cf = new ChessFigure(1, 2, true);
    Rook r = new Rook(1, 2, true);
    System.out.println(r.isLegalMove(5, 2));
    System.out.println(r.isLegalMove(5, 5));
  }

  static void substitution() {
    ChessFigure r = new Rook(1, 2, true);
    King k = new King(5,5, false);
    System.out.println(canFigureMoveTo(r, 5, 2));
    System.out.println(canFigureMoveTo(k, 5,6));
  }

  static boolean canFigureMoveTo(ChessFigure cf, int newRow, int newCol) {
    return cf.isLegalMove(newRow, newCol);
  }

  public static void main(String[] args) {
    // 4 принципа ООП
    // Абстракция
//    abstraction();
    // Полиморфизм
//    polymorphism();
    // Наследование
//    inheritance();
    // Инкапсуляция
//    encapsulation();
    // Сеттеры и геттеры
//    settersGetters();
//    task1();
//    task2();
    // класс Object
//    objectClass();
    // Ключевое слово final
//    finalKeyword();
    // Ключевое слово abstract
//    abstractKeyword();
    // Подстановка наследников на место предка
//    substitution();
  }
}

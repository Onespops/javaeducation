package lesson1;

import java.util.Scanner;

public class Main {
    static final double NUMBER_PI = 3.14;

    public static void main(String[] args) {
        // Однострочный  комментарий
        /*
        Многострочный
        комментарий
         */

        // sout аббревиатура
        // Вывод на экран
        System.out.println("Привет мир!");
        System.out.println(4);
        System.out.println(1 + 3);

        System.out.println("Арифметические операции над целыми числами");
        System.out.println(5 + 2);
        System.out.println(5 - 2);
        System.out.println(5 * 2);
        System.out.println(5 / 2);
        System.out.println(5 % 2); // остаток от деления

        System.out.println("Арифметические операции над дробными числами");
        System.out.println(5.0 + 2.0);
        System.out.println(5.0 - 2.0);
        System.out.println(5.0 * 2.0);
        System.out.println(5.0 / 2.0);
        System.out.println(5.0 % 2.0); // остаток от деления
        System.out.println(5.5 % 2.2);

        System.out.println("Это первая часть строки, " + "это вторая часть строки");
        System.out.println("Это " + 3 + " строка");

        // Порядок действий - как в математике
        System.out.println(3 + 2 * 5);
        System.out.println((3 + 2) * 5);

        // task1
        /*
        денег_через_год = исходная_сумма * (1 + процент / 100) = исходная сумма + исходная_сумма / 100 * 7.4
        Человек положил 88 888 у.е. в банк на 1 год под 7.4%
        Вывести на экран сколько через год у него будет денег (ответ должен быть 95465,712)
         */
        System.out.println(88888 * (1 + 7.4 / 100));
        System.out.println(88888 + 88888 * 7.4 / 100);
        System.out.println(88888 + 88888 / 100 * 7.4); // неверный результат, потому что 88888/100 = 888 (целочисленное деление)

//        System.out.println(100000 * (1 + 11 / 100));
        // task1.5
        /*
        Сколько будет через 3 года? (ответ должен быть 102531,249)
         */
        System.out.println(88888 * (1 + 7.4 / 100) * (1 + 7.4 / 100) * (1 + 7.4 / 100));

        System.out.println("Особенности стандарта работы с дробными числами");
        System.out.println(0.1 + 0.2);
        System.out.println(0.1 + 0.2 == 0.3);

        // Переменные - именованные данные
        // Под переменную выделяется память,
        // создается соответствие имени переменной и адреса в памяти у данных
        int balance = 88888;
        double coef = 1 + 7.4 / 100;
        double result = balance * coef * coef * coef;
        System.out.println(result);

        // Создание переменной - резервирование имени под определенный тип данных
        // Синтаксис:
        // тип_данных имя_переменной;
        int nameOfVariable;
        // Инициализация переменной - задание первоначального значения переменной
        // Синтаксис
        // имя_переменной = начальное_значение;
        nameOfVariable = 5;

        System.out.println(nameOfVariable);
        System.out.println(nameOfVariable + 1);

        nameOfVariable = -101;
        System.out.println(nameOfVariable);
        System.out.println(nameOfVariable+1);

        double pi = 3.14;
        double length = pi * 2 * 5;
        System.out.println("длина окружности с радиусом 5 = " + length);

        // task2
        /*
        На градуснике 100 градусов фаренгейта
        Сколько это по цельсию? (C = (F - 32) * 5 / 9)
        Исходные данные - переменная (тип - double)
        Выходные данные - переменная (тип - double)
         */
        double farhenheit = 100;
        double celsius = (farhenheit - 32) * 5 / 9;
        System.out.println(celsius);

        // Типы данных
        // 1. Примитивные типы данных
        // 2. Ссылочные типы данных (массивы, классы и т.п.)

        // Примитивные типы
        // Целые числа
        // byte - 1 байт, диапазон значений -128..127
        byte b = 127;
        // short - 2 байта, диапазон значений -32768..32767
        short s = -32000;
        // int - 4 байт, диапазон значений -2 млрд..2 мрлд
        int i = 2_100_000_000;
        // long - 8 байт, диапазон значений -9*10^18..9*10^18
        long l = 2_200_000_000L;

        // дробные числа
        // double - 8 байт, 16 знаков после запятой точности
        double d = 3.14141414141414149999;
        System.out.println(d);
        // float - 4 байта, 7 знаков после запятой точности
        float f = 3.14141419999f;
        System.out.println(f);

        // символьный тип, 2 байта
        char c = 'a';
        System.out.println(c);
        System.out.println(c + 1 - 1);
        c = 'ы';
        System.out.println(c);
        System.out.println(c + 1 - 1);
        c = '国';
        System.out.println(c);
        System.out.println(c + 1 - 1);

        // boolean, логический тип данных, всего 2 значения - true и false
        boolean bool = true;
        bool = false;

        // String (СИМВОЛЬНЫЙ тип) - текстовый тип данных
        String str = "Привет, мир";
        System.out.println(str + "!");

        // Приведение типов - превращение одного типа в другой
        // Восходящее приведение - тип меньшей длины приводим в тип большей длины
        int intNumber = 5;
        long longNumber = intNumber;

        // Нисходящее приведение - тип большей длины приводим в тип меньшей длины
        longNumber = 2_100_000_000;
        intNumber = (int) longNumber;
        System.out.println(intNumber);

        longNumber = 2_200_000_000L;
        intNumber = (int) longNumber;
        System.out.println(intNumber);

        // Имена переменных (и имена в целом)
        // Начинаются с буквы, затем можно использовать буквы/цифры
        int num57num = 0;
//        int 57numnum = 0;
//        int переменная国;
        // Если несколько слов, то первое с маленькой буквы, следующие - с больших
        int ageOfMsu = 300;
//        int age_of_msu = 300;

        System.out.println(3.14 * 2 > 6.2);
        System.out.println(3.14 * 3 < 9);

        System.out.println("Условные выражения");
        System.out.println(5 > 2);
        System.out.println(5 >= 5);
        System.out.println(5 < 2);
        System.out.println(5 <= 5);

        System.out.println(2 + 3 == 5);
        System.out.println(2 + 3 != 5);

        System.out.println('g' > 'a');

        System.out.println("Логические операторы");
        System.out.println("Логическое отрицание");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("Логическое сложение, ИЛИ");
        // Является правдой если хотя бы одно правда = является ложью если КАЖДЫЙ ложь
        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(true || true);

        System.out.println("Логическое умножение, И");
        // Является ложью если хотя бы одно ложь = является истиной если КАЖДЫЙ истина
        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(true && true);

        // Условный оператор
        result = 101000;
        if (result > 105000) {
            // всё написанное в этом блоке выполнится ТОЛЬКО если условие - истина
            System.out.println("Покупку совершить возможно");
            System.out.println("Останется " + (result - 105000) + " у.е.");
        } else {
            // всё написанное в блоке else выполнится ТОЛЬКО если условие - ложь
            System.out.println("Покупку совершить невозможно");
            System.out.println("Не хватает " + (105000 - result) + " у.е.");
        }

        int k = 0;
        if (k == 0) {
            System.out.println("0");
        } else if (k > 0) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }

        // Ввод пользователя
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        int inputI = sc.nextInt(); // спросить у пользователя целое число
        System.out.println("Введите дробное число");
        double inputD = sc.nextDouble(); // спросить у пользователя дробное число
//        String inputStr = sc.nextLine(); // спросить у пользователя строку
        System.out.println(inputI);
        System.out.println(inputD);
//        System.out.println(inputStr);
    }
}
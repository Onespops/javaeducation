package lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер дня недели");
        int day = sc.nextInt();
        System.out.println(day);

        // 1 вариант
        if (day == 1) {
            System.out.println("Пн");
        }
        if (day == 2) {
            System.out.println("Вт");
        }
        if (day == 3) {
            System.out.println("Ср");
        }
        if (day == 4) {
            System.out.println("Чт");
        }
        if (day == 5) {
            System.out.println("Пт");
        }
        if (day == 6) {
            System.out.println("Су");
        }
        if (day == 7) {
            System.out.println("Вс");
        }
        if (day < 1 || day > 7) {
            System.out.println("Неверный номер дня");
        }

        // 2 вариант
        if (day == 1) {
            System.out.println("Пн");
        } else if (day == 2) {
            System.out.println("Вт");
        } else if (day == 3) {
            System.out.println("Ср");
        } else if (day == 4) {
            System.out.println("Чт");
        } else if (day == 5) {
            System.out.println("Пт");
        } else if (day == 6) {
            System.out.println("Су");
        } else if (day == 7) {
            System.out.println("Вс");
        } else {
            System.out.println("Неверный номер дня");
        }

        // 3 вариант
        switch (day) {
            case 1:
                System.out.println("Пн");
                break;
            case 2:
                System.out.println("Вт");
                break;
            case 3:
                System.out.println("Ср");
                break;
            case 4:
                System.out.println("Чт");
                break;
            case 5:
                System.out.println("Пт");
                break;
            case 6:
                System.out.println("Су");
                break;
            case 7:
                System.out.println("Вс");
                break;
            default:
                System.out.println("Неверный номер дня");
        }

        // task1
        /*
        Спросить у пользователя целое число (положив его в переменную)
        В случае если оно находится в диапазоне 1-100 (включая границы), вывести "Попал"
        Если нет, то вывести квадрат числа
         */
        int x = sc.nextInt();
        if (x >= 1 && x <= 100) {
            System.out.println("Попал");
        } else {
            System.out.println(x * x);
        }
        // task2
        /*
        Дополнить первое задание кодом так, чтобы при числе в диапазонах от -100 до 0 или 101-200,
        выводилось слово "Близко"
        (Квадрат числа выводить только если не попали ни в один диапазон)
         */
        if (x >= 1 && x <= 100) {
            System.out.println("Попал");
        } else if (x >= -100 && x <= 0) {
            System.out.println("Близко");
        } else if (x >= 101 && x <= 200) {
            System.out.println("Близко");
        } else {
            System.out.println(x * x);
        }

        if (x >= 1 && x <= 100) {
            System.out.println("Попал");
        } else if ((x >= -100 && x <= 0) || (x >= 101 && x <= 200)) {
            System.out.println("Близко");
        } else {
            System.out.println(x * x);
        }

        // task3 (*)
        /*
        Спросить у пользователя три дробных числа a,b,c
        Посчитать корни квадратного уравнения a*x*x + b*x + c = 0
        Math.sqrt(n) - квадратный корень
        дискриминант:
        < 0 - нет корней
        = 0 - 1 корень
        > 0 - 2 корня
         */

        // Массив - тип данных для хранения нескольких значений под одним именем
        // Массив (array) - набор элементов одного типа фиксированной длины с порядковыми номерами
        // Определение массива
        int[] arrInt;
//        // Инициализация массива
//        // 1 способ - через указание длины
        arrInt = new int[5]; // arrInt - набор из пяти int чисел
//        // 2 способ - через указание самих элементов
        arrInt = new int[]{5, -10, 2, 101, 67, 1};

        // Действия с массивом
        System.out.println(arrInt);
        int[] arrIntCopy = new int[]{5, -10, 2, 101, 67, 1};
        System.out.println(arrIntCopy);

        // Вывод на экран в удобноваримом формате
        System.out.println(Arrays.toString(arrInt));

        // Работа с элементами через порядковый номер
        // Порядковый номер - индекс и начинается с 0
        // Взятие элемента по индексу
        System.out.println(arrInt[0]);
        System.out.println(arrInt[3]);
        // Изменение элемента по индексу
        arrInt[0] = -5;
        System.out.println(Arrays.toString(arrInt));

        // Получить длину массива
        System.out.println(arrInt.length);

        // При создании по длине массива он заполняется "нулями" соответствующих типов
        // byte, short, int, long - 0
        // float, double - 0.0
        // boolean - false
        // char - пустой символ
        // все остальные типы - null
        double[] nullDoubles = new double[10];
        System.out.println(Arrays.toString(nullDoubles));

        char[] nullChars = new char[2];
        System.out.println(Arrays.toString(nullChars));

        String[] nullStrings = new String[3];
        System.out.println(Arrays.toString(nullStrings));


        // Циклы - возможность повторить блок кода несколько раз
        // 1) Цикл while - выполняется пока условие цикла верно
        int j = 5;
        while (j > 0) {
            System.out.println(j);
            j = j - 1;
        }
        System.out.println("Фраза после цикла, i = " + j);

        // Неверное инициализация переменной, условие или изменение внутри цикла может привести к зацикливанию
        // Бесконечный цикл
//        while (i >= 0) {
//            System.out.println(i);
//            i = i + 1;
//        }
//
        // Цикл не исполнится
//        int j = -5;
//        while (j > 0) {
//            System.out.println(21);
//        }

        // 2) Цикл for
        for (int n = 0; n < 10; n = n + 2) {
            System.out.println(n);
        }

        // Работа с массивами при помощи циклов
        int[] grages = new int[]{3,4,3,3,5,2,2,3,4,2,3,4,3};

        for (int index = 0; index < grages.length; index++) {
            System.out.println((index + 1) + " оценка в четверти: " + grages[index]);
        }

        int sum = 0;
        for (int i = 0; i < grages.length; i++) {
            sum = sum + grages[i];
        }
        System.out.println("Сумма оценок: " + sum);
        System.out.println("Средняя оценка = " + (1.0 * sum / grages.length));

        double[] doubles = new double[]{4.5, 1.1, 0.0, 100.1, -2.7};
        double prod = 1;
        for (int i = 0; i < doubles.length; i++) {
            prod = prod * doubles[i];
        }
        System.out.println(prod);


        double max = doubles[0];
        for (int i = 1; i < doubles.length; i++) {
            if (doubles[i] > max) {
                max = doubles[i];
            }
        }
        System.out.println("максимум среди дробных = " + max);

        double min = doubles[0];
        for (int i = 1; i < doubles.length; i++) {
            if (doubles[i] < min) {
                min = doubles[i];
            }
        }
        System.out.println("минимум среди дробных = " + min);

        // расчет произведения с помощью for..each
        prod = 1;
        for (double aDouble : doubles) {
            prod = prod * aDouble;
        }
        System.out.println(prod);

        // взять элементы на четных местах
        for (int i = 0; i < doubles.length; i = i + 2) {
            System.out.println(doubles[i]);
        }

        // task4
        /*
        Создать массив целых чисел с именем ints и длиной 5
        Заполнить каждый элемент каким-нибудь числом
        с помощью операции присваивания
        Вывести весь массив на экран с помощью Arrays
         */
        int[] ints = new int[5];
        ints[0] = 4;
        ints[1] = 10;
        ints[2] = -2;
        ints[3] = 7;
        ints[4] = 9;
        System.out.println(Arrays.toString(ints));
        // task5
        /*
        С помощью цикла for или while пройтись по всем элементам массива
        и вывести их квадраты на экран по одному в строке
         */
        int ix = 0;
        while (ix < ints.length) {
            System.out.println(ints[ix] * ints[ix]);
            ix = ix + 1;
        }
        // task6
        /*
        С помощью цикла for или while заменить каждый четный элемент на квадрат
        а каждый нечетный на 0
        Вывести весь массив на экран
         */
        for (int i = 0; i < ints.length; i++) {
            int element = ints[i];
            if (element % 2 == 0) {
                ints[i] = element * element;
            } else {
                ints[i] = 0;
            }
        }
        System.out.println(Arrays.toString(ints));
        // task7 (*)
        /*
        Спросить у пользователя целое число N
        создать треугольник высотой N
        (возможно запускать цикл в цикле)
        Пример: N = 5               N = 3
        *                           *
        **                          **
        ***                         ***
        ****
        *****
         */

        // Краткие арифметические действия над переменной
        int perem = 10;
        perem += 5; // увеличение на 5, perem = perem + 5
        System.out.println(perem);
        perem -=4; // уменьшение на 4, perem = perem - 4
        System.out.println(perem);
        perem *= 2; // увеличить в два раза, perem = perem * 2
        System.out.println(perem);
        perem /= 2; // уменьшить в два раза, perem = perem / 2
        System.out.println(perem);
        perem %= 4; // положить остаток от деления на 4 в переменную, perem = perem % 4
        System.out.println(perem);

        // Инкремент
        perem++;
        // Декремент
        perem--;

        ++perem;
        --perem;

        perem = 3;
        System.out.println(5 * perem++);
        perem = 3;
        System.out.println(5 * ++perem);

        perem = 3;
        System.out.println(perem*perem);
        System.out.println(perem);

        for (int i = 1;;i++) {
            System.out.println("infinite " + i);
        }

    }
}

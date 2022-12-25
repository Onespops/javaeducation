package lesson8;

import java.util.*;

public class Main {
  static void arrays() {
    // Массивы - пронумерованный набор элементов одного и того же типа фиксированной длины
    // Возможные действия:
    // создание массива (с указанием длины или с указанием элементов)
    int[] arrInt = new int[]{1, 2, 3, 5, 10, -1000};

    // Взятие длины массива
    System.out.printf("Длина массива arrInt = %d\n", arrInt.length);

    // Взятие элемента по индексу (индексы начинаются с 0)
    System.out.printf("Первый элемент = %d, последний элемент = %d\n", arrInt[0], arrInt[arrInt.length - 1]);

    // Изменение элемента на индексе
    System.out.printf("Четвертый по порядку элемент до изменения равен = %d\n", arrInt[3]);
    arrInt[3] = -5;
    System.out.printf("Четвертый по порядку элемент теперь равен = %d\n", arrInt[3]);

    // Все остальные возможные действия содержатся в специальном классе Arrays
    // Превращение в строку
    System.out.printf("Массив arrInt: %s\n", Arrays.toString(arrInt));

    // Сортировка
    Arrays.sort(arrInt);
    System.out.printf("Массив arrInt после сортировки: %s\n", Arrays.toString(arrInt));

    // Поиск элемента в отсортированном массиве
    int indexOfTen = Arrays.binarySearch(arrInt, 10);
    System.out.printf("Элемент 10 лежит на индексе %d\n", indexOfTen);
    int indexOfEleven = Arrays.binarySearch(arrInt, 11);
    System.out.printf("Элемент 11 лежит на индексе %d\n", indexOfEleven);

    // Сравнение с другими массивами
    int[] newArrInt = new int[]{-1000, -5, 1, 2, 3, 10};
    System.out.printf("Массив arrInt равен [-1000, -5, 1, 2, 3, 10] - %s\n", Arrays.equals(arrInt, newArrInt));
  }

  static void lists1() {
    // Список (list) - пронумерованный набор элементов одного и того же типа с возможностью менять длину
    // Все классы под структуры данных в Java работают с "алмазным оператором"
    ArrayList<Integer> intList = new ArrayList<>();

    // Превращение в строку
    System.out.printf("intList = %s\n",  intList);

    // Получение длины
    System.out.printf("Длина intList = %d\n", intList.size());

    // Добавление элемента
    // 1) В конец списка
    intList.add(1);
    intList.add(2);
    System.out.printf("intList = %s\tlength = %d\n",  intList, intList.size());
    // 2) По определенному индексу
    intList.add(0, -5);
    System.out.printf("intList = %s\tlength = %d\n",  intList, intList.size());
    intList.add(1, 0);
    System.out.printf("intList = %s\tlength = %d\n",  intList, intList.size());

    // Получение элемента по индексу
    System.out.printf("Первый элемент = %d, последний элемент = %d\n", intList.get(0), intList.get(intList.size() - 1));

    // Удалить элемент
    // 1) Удалим по индексу
    intList.remove(0);
    System.out.printf("intList после удаления = %s\tlength = %d\n",  intList, intList.size());
    // 2) Удаление по значению
    intList.remove(new Integer(1));
    System.out.printf("intList после удаления единицы = %s\tlength = %d\n",  intList, intList.size());
    // Удаление по значению классов не Integer проходит легче, не нужно дополнительной записи как new Integer()
    ArrayList<String> strings = new ArrayList<>();
    strings.add("Привет");
    strings.add("Меня");
    strings.add("Зовут");
    strings.add("Андрей");
    System.out.println(strings);
    strings.remove("Привет");
    System.out.println(strings);

    // Копирование - нужно по той причине, что мы работаем с объектами
    ArrayList<String> badCopyOfStrings = strings; // создание нового "имени" для старого объекта
    ArrayList<String> goodCopyOfStrings1 = (ArrayList<String>) strings.clone();
    ArrayList<String> goodCopyOfStrings2 = new ArrayList<>(strings);

    // Очистить от значений
    strings.clear();
    System.out.println(strings);
    System.out.println(badCopyOfStrings);
    System.out.println(goodCopyOfStrings1);
    System.out.println(goodCopyOfStrings2);

    // Проверить список на отсутствие значений
    System.out.printf("intList пустой = %s\n", intList.isEmpty());
    System.out.printf("strings пустой = %s\n", strings.isEmpty());

    // Проверка на наличие значения и нахождение его индекса
    System.out.printf("внутри intList есть 5 = %s\n", intList.contains(5));
    System.out.printf("внутри intList есть 0 = %s\n", intList.contains(0));

    intList.add(0);
    intList.add(0);
    System.out.printf("intList = %s\n", intList);
    System.out.printf("В первый раз 0 встречается на %d индексе\n", intList.indexOf(0));
    System.out.printf("В первый раз 2 встречается на %d индексе\n", intList.indexOf(2));

    System.out.printf("В последний раз 0 встречается на %d индексе\n", intList.lastIndexOf(0));
    System.out.printf("В последний раз 2 встречается на %d индексе\n", intList.lastIndexOf(2));

    System.out.printf("Значение 5 на %d индексе\n", intList.indexOf(5));
    System.out.printf("Последнее значение 5 на %d индексе\n", intList.lastIndexOf(5));

    // Изменить элемент по индексу
    System.out.printf("intList = %s\n", intList);
    intList.set(3, 100);
    System.out.printf("intList = %s\n", intList);

    // Сортировка (нужно указать правило сортировки)
    intList.sort((x, y) -> y - x);
    intList.sort(Comparator.comparingInt(x -> x));
    System.out.printf("intList = %s\n", intList);
  }

  static void task1() {
    // Создать список (ArrayList) строк
    // Заполнить его 5 значениями (любыми)
    // Удалить из списка 2 по индексу строку
    // Изменить элемент на индексе 1 на "Ура"
    // После каждого действия выводить список на экран
  }

  static void lists2() {
// Список (list) - пронумерованный набор элементов одного и того же типа с возможностью менять длину
    // Все классы под структуры данных в Java работают с "алмазным оператором"
    LinkedList<Integer> intList = new LinkedList<>();

    // Превращение в строку
    System.out.printf("intList = %s\n",  intList);

    // Получение длины
    System.out.printf("Длина intList = %d\n", intList.size());

    // Добавление элемента
    // 1) В конец списка
    intList.add(1);
    intList.add(2);
    System.out.printf("intList = %s\tlength = %d\n",  intList, intList.size());
    // 2) По определенному индексу
    intList.add(0, -5);
    System.out.printf("intList = %s\tlength = %d\n",  intList, intList.size());
    intList.add(1, 0);
    System.out.printf("intList = %s\tlength = %d\n",  intList, intList.size());

    // Получение элемента по индексу
    System.out.printf("Первый элемент = %d, последний элемент = %d\n", intList.get(0), intList.get(intList.size() - 1));

    // Удалить элемент
    // 1) Удалим по индексу
    intList.remove(0);
    System.out.printf("intList после удаления = %s\tlength = %d\n",  intList, intList.size());
    // 2) Удаление по значению
    intList.remove(new Integer(1));
    System.out.printf("intList после удаления единицы = %s\tlength = %d\n",  intList, intList.size());
    // Удаление по значению классов не Integer проходит легче, не нужно дополнительной записи как new Integer()
    LinkedList<String> strings = new LinkedList<>();
    strings.add("Привет");
    strings.add("Меня");
    strings.add("Зовут");
    strings.add("Андрей");
    System.out.println(strings);
    strings.remove("Привет");
    System.out.println(strings);

    // Копирование - нужно по той причине, что мы работаем с объектами
    LinkedList<String> badCopyOfStrings = strings; // создание нового "имени" для старого объекта
    LinkedList<String> goodCopyOfStrings1 = (LinkedList<String>) strings.clone();
    LinkedList<String> goodCopyOfStrings2 = new LinkedList<>(strings);

    // Очистить от значений
    strings.clear();
    System.out.println(strings);
    System.out.println(badCopyOfStrings);
    System.out.println(goodCopyOfStrings1);
    System.out.println(goodCopyOfStrings2);

    // Проверить список на отсутствие значений
    System.out.printf("intList пустой = %s\n", intList.isEmpty());
    System.out.printf("strings пустой = %s\n", strings.isEmpty());

    // Проверка на наличие значения и нахождение его индекса
    System.out.printf("внутри intList есть 5 = %s\n", intList.contains(5));
    System.out.printf("внутри intList есть 0 = %s\n", intList.contains(0));

    intList.add(0);
    intList.add(0);
    System.out.printf("intList = %s\n", intList);
    System.out.printf("В первый раз 0 встречается на %d индексе\n", intList.indexOf(0));
    System.out.printf("В первый раз 2 встречается на %d индексе\n", intList.indexOf(2));

    System.out.printf("В последний раз 0 встречается на %d индексе\n", intList.lastIndexOf(0));
    System.out.printf("В последний раз 2 встречается на %d индексе\n", intList.lastIndexOf(2));

    System.out.printf("Значение 5 на %d индексе\n", intList.indexOf(5));
    System.out.printf("Последнее значение 5 на %d индексе\n", intList.lastIndexOf(5));

    // Изменить элемент по индексу
    System.out.printf("intList = %s\n", intList);
    intList.set(3, 100);
    System.out.printf("intList = %s\n", intList);

    // Сортировка (нужно указать правило сортировки)
    intList.sort((x, y) -> y - x);
    intList.sort(Comparator.comparingInt(x -> x));
    System.out.printf("intList = %s\n", intList);

    // Существует ещё одна реализация списка - класс Vector
    // Все методы Vector - потокобезопасные
  }

  static void stack() {
    // Стек - структура данных, которая работает по принципу LIFO (Last In - First Out)
    Stack stack = new Stack();
    System.out.println(stack);
    stack.push(1);
    stack.push(3);
    stack.push(2);
    System.out.println(stack);

    System.out.println(stack.pop());
    System.out.println(stack);
  }

  static void queue() {
    // Очередь - структура данных, которая работает по принципу FIFO (First In - First Out)
    Queue queue = new Queue();
    System.out.println(queue);
    queue.queue(1);
    queue.queue(3);
    queue.queue(2);
    System.out.println(queue);

    System.out.println(queue.dequeue());
    System.out.println(queue);
  }

  static void deque() {
    // Двусторонняя очередь - структура данных, с которой можно взаимодействовать через начало и через конец
    // LinkedList можно использовать как Deque
    // LinkedList как стек
    LinkedList<String> listAsStack = new LinkedList<>();
    System.out.printf("Stack%s\n", listAsStack);
    listAsStack.addLast("1");
    listAsStack.addLast("3");
    listAsStack.addLast("2");
    System.out.printf("Stack%s\n", listAsStack);

    System.out.println(listAsStack.pollLast());
    System.out.printf("Stack%s\n", listAsStack);

    // LinkedList как очередь
    LinkedList<String> listAsQueue = new LinkedList<>();
    System.out.printf("Queue%s\n", listAsQueue);
    listAsQueue.addLast("1");
    listAsQueue.addLast("3");
    listAsQueue.addLast("2");
    System.out.printf("Queue%s\n", listAsQueue);

    System.out.println(listAsQueue.pollFirst());
    System.out.printf("Queue%s\n", listAsQueue);
  }

  static void set() {
    // Множество - неупорядоченный набор уникальных элементов одного и того же типа
    HashSet<String> unicStrs = new HashSet<>();
    System.out.println(unicStrs);
    unicStrs.add("asce");
    unicStrs.add("123");
    unicStrs.add("asd");
    System.out.println(unicStrs);

    HashSet<Integer> unicInts = new HashSet<>();
    unicInts.add(4);
    unicInts.add(-50);
    unicInts.add(-1);
    unicInts.add(401);
    unicInts.add(401);
    System.out.println(unicInts);

    unicInts.remove(401);
    System.out.println(unicInts);

    System.out.printf("-1 содержится в unicInts %s\n", unicInts.contains(-1));
    System.out.printf("401 содержится в unicInts %s\n", unicInts.contains(401));

    // isEmpty(), size(), clear() и clone() такие же по функционалу как и в списках

    // Работать со всеми значениями множества можно только через for..each
    for (Integer item : unicInts) {
      System.out.println(item);
    }
  }

  static void setVariants() {
    // LinkedHashSet - набор уникальных элементов одного и того же типа, хранящий их в порядке добавления
    LinkedHashSet<String> linkedUnicStrs = new LinkedHashSet<>();
    System.out.println(linkedUnicStrs);
    linkedUnicStrs.add("asce");
    linkedUnicStrs.add("123");
    linkedUnicStrs.add("asd");
    System.out.println(linkedUnicStrs);

    LinkedHashSet<Integer> linkedUnicInts = new LinkedHashSet<>();
    linkedUnicInts.add(4);
    linkedUnicInts.add(-50);
    linkedUnicInts.add(-1);
    linkedUnicInts.add(401);
    linkedUnicInts.add(401);
    System.out.println(linkedUnicInts);

    // TreeSet - набор уникальных элементов одного и того же типа, хранящий их в порядке возрастания
    TreeSet<String> treeUnicStrs = new TreeSet<>();
    System.out.println(treeUnicStrs);
    treeUnicStrs.add("asce");
    treeUnicStrs.add("123");
    treeUnicStrs.add("asd");
    treeUnicStrs.add("Антон");
    treeUnicStrs.add("Анна");
    treeUnicStrs.add("Андрей");
    System.out.println(treeUnicStrs);

    TreeSet<Integer> treeUnicInts = new TreeSet<>();
    treeUnicInts.add(4);
    treeUnicInts.add(-50);
    treeUnicInts.add(-1);
    treeUnicInts.add(401);
    treeUnicInts.add(401);
    System.out.println(treeUnicInts);
  }

  static void map() {
    // Словари - нелинейная структура данных, которая хранит информацию в виде набора пар элементов "ключ-значение"
    HashMap<Integer, String> days = new HashMap<>();
    System.out.println(days);

    // Добавление пары элементов
    days.put(1, "Понедельник");
    days.put(2, "Вторник");
    days.put(3, "Среда");
    days.put(4, "Четверг");
    days.put(5, "Пятница");
    days.put(6, "Суббота");
    days.put(7, "Воскресенье");
    System.out.println(days);

    // Получение значения по ключу
    System.out.printf("1 день недели это %s\n", days.get(1));
    System.out.printf("2 день недели это %s\n", days.get(2));

    // Удалить пары элементов
    System.out.printf("Удаляю по ключу 2 значение %s\n", days.remove(2));
    System.out.printf("Попытка удалить по ключу 6 значение 'воскресенье' = %s\n", days.remove(6, "воскресенье"));
    System.out.println(days);
    System.out.printf("Попытка удалить по ключу 6 значение 'Суббота' = %s\n", days.remove(6, "Суббота"));
    System.out.println(days);

    // Узнать наличие ключа/значение
    System.out.printf("Ключ 3 существует в days = %s\n", days.containsKey(3));
    System.out.printf("Значение 'Среда' существует в days = %s\n", days.containsValue("Среда"));

    // Заменить значение по ключу
    days.replace(5, "Friday");
    days.replace(10, "Какой-то новый день");
    System.out.println(days);

    System.out.printf("Попытка изменить значение по ключу 7 с 'воскресенье' на 'sunday' = %s\n",
        days.replace(7, "воскресенье", "sunday"));
    System.out.println(days);
    System.out.printf("Попытка изменить значение по ключу 7 с 'Воскресенье' на 'Sunday' = %s\n",
        days.replace(7, "Воскресенье", "Sunday"));
    System.out.println(days);

    days.put(2, "Вторник");
    System.out.println(days);
    days.put(2, "Tuesday");
    System.out.println(days);

    // Учитывая свойства словарей, ключи - уникальные значения, поэтому можно превратить все ключи во множество ключей
    System.out.println(days.keySet());
    // Взять все значения в виде списка
    System.out.println(days.values());

    for (Integer key : days.keySet()) {
      System.out.printf("Ключ %d, значение %s\n", key, days.get(key));
    }
  }

  static void mapVariants() {
    LinkedHashMap<String, Integer> linkedUnicStrs = new LinkedHashMap<>();
    System.out.println(linkedUnicStrs);
    linkedUnicStrs.put("asce", 1);
    linkedUnicStrs.put("123", 2);
    linkedUnicStrs.put("asd", 3);
    System.out.println(linkedUnicStrs);

    LinkedHashMap<Integer, Integer> linkedUnicInts = new LinkedHashMap<>();
    linkedUnicInts.put(4, 1);
    linkedUnicInts.put(-50, 2);
    linkedUnicInts.put(-1, 3);
    linkedUnicInts.put(401, 4);
    System.out.println(linkedUnicInts);

    TreeMap<String, Integer> treeUnicStrs = new TreeMap<>();
    System.out.println(treeUnicStrs);
    treeUnicStrs.put("asce", 1);
    treeUnicStrs.put("123", 2);
    treeUnicStrs.put("asd", 3);
    treeUnicStrs.put("Антон", 4);
    treeUnicStrs.put("Анна", 5);
    treeUnicStrs.put("Андрей", 6);
    System.out.println(treeUnicStrs);

    TreeMap<Integer, Integer> treeUnicInts = new TreeMap<>();
    treeUnicInts.put(4, 1);
    treeUnicInts.put(-50, 2);
    treeUnicInts.put(-1, 3);
    treeUnicInts.put(401, 4);
    System.out.println(treeUnicInts);
  }

  static void task2() {
    /*
    Создать класс Person,
      два поля name и age,
      один конструктор с двумя полями,
      добавить toString

    В psvm создать три объекта класса Person и поместите их в словарь по правилу:
    ключ = строка имени, значение = объект класса Person

    Вывести с помощью sout словарь

    Если среди ключей есть ключ "Иван", вывести его через sout
     */

    Person p1 = new Person("Андрей", 23);
    Person p2 = new Person("Иван", 25);
    Person p3 = new Person("Василий", 21);

    HashMap<String, Person> persons = new HashMap<>();
    persons.put(p1.name, p1);
    persons.put(p2.name, p2);
    persons.put(p3.name, p3);

    System.out.println(persons);

    if (persons.containsKey("Иван")) {
      System.out.println(persons.get("Иван"));
    }
  }

  public static void main(String[] args) {
    // Структуры данных - специальные типы данных для хранения большого количества значений по определенным правилам
//    arrays();
//    lists1();
//    lists2();
//    task1();
//    stack();
//    queue();
//    deque();
//    set();
//    setVariants();
//    map();
//    mapVariants();
    task2();
  }
}

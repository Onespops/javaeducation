package lesson5;

/*
Создать два класса Tree и Bush, наследующиеся от класса Plant
    У обоих классов будут конструкторы работающие так же, как и конструктор Plant
    Метод grow в классе Tree будет увеличивать поле с высотой на 0.9
    Метод grow в классе Bush будет увеличивать поле с шириной на 0.05
В psvm создать объекты Tree и Bush, вывести их поля, вызвать метод grow и вывести поля ещё раз
Задание со "звездочкой":
    Создать массив с типом данных Plant, поместить туда созданные ранее объекты классов Tree и Bush
    С помощью цикла for получить каждое растение и вызвать у него метод grow()
 */
public class HW2 {

  public static void main(String[] args) {
    Tree tree = new Tree(3, 0.5);
    Bush bush = new Bush(1, 1.5);
    // До роста
    System.out.println("Tree " + tree.height + " " + tree.width);
    System.out.println("Bush " + bush.height + " " + bush.width);

    tree.grow();
    bush.grow();
    // После первого роста
    System.out.println("Tree " + tree.height + " " + tree.width);
    System.out.println("Bush " + bush.height + " " + bush.width);

    // *
    Plant[] plants = new Plant[]{tree, bush};

    for (int i = 0; i < plants.length; i++) {
      plants[i].grow();
    }
    // После 2 роста через цикл for
    System.out.println("Tree " + tree.height + " " + tree.width);
    System.out.println("Bush " + bush.height + " " + bush.width);

    for (Plant p : plants) {
      p.grow();
    }
    // После 3 роста через цикл for..each
    System.out.println("Tree " + tree.height + " " + tree.width);
    System.out.println("Bush " + bush.height + " " + bush.width);
  }
}

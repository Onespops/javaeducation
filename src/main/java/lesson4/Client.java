package lesson4;

public class Client {
  // состояние - набор полей (характеристик)
  String name;
  long id;
  double balance;

  // конструкторы - варианты создания объекта
  Client() {
    System.out.println("Создание клиента");
  }

  Client(String n, long i, double b) {
    name = n;
    id = i;
    balance = b;
  }

  Client(String n, long i) {
    name = n;
    id = i;
    balance = 0.0;
  }

  // поведение - набор методов (действий)
  void print() {
    System.out.println("Клиент №" + id + ": " + name + " $" + balance);
  }

  void changeBalance(double amount) {
    balance += amount;
  }

  double checkBalance() {
    return balance;
  }
}

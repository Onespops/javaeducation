package lesson12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  static void clientDAO() {
    try (Connection conn = DriverManager.getConnection("jdbc:sqlite:clients.db")) {
      ClientDAO clientDAO = new ClientDAO(conn);

      Client c1 = new Client("franzandrewn", 23, "123123123");
      Client c2 = new Client("somelogin", 22, "123asdqwe");

//      System.out.println(clientDAO.getAll());
//      clientDAO.add(c1);
//      clientDAO.add(c2);
      System.out.println(clientDAO.getAll());

      System.out.println(clientDAO.getById(1));
      System.out.println(clientDAO.getById(2));
      System.out.println(clientDAO.getById(3));

      System.out.println(clientDAO.change(2, "somelogin", 22, "123123asd"));
      System.out.println(clientDAO.change(3, "somelogin", 22, "123123asd"));

      System.out.println(clientDAO.getAll());

      clientDAO.delete(2);
      System.out.println(clientDAO.getAll());

      clientDAO.birthday(1);
      System.out.println(clientDAO.getAll());
    } catch (SQLException throwables) {
      System.out.println(throwables.getMessage());
    }
  }

  static void streamAPI() {
    List<Integer> ints = new ArrayList<>();
    ints.add(5);
    ints.add(1);
    ints.add(2);
    ints.add(-10);
    ints.add(7);
    ints.add(4);
    ints.add(2);
    ints.add(0);
    ints.add(1);

    System.out.println(ints);

    List<Integer> afterStream;
//    afterStream = ints.stream().distinct().collect(Collectors.toList());
//    afterStream = ints.stream()
//        .sorted()
//        .collect(Collectors.toList());
    // 1 вариант - наследование, самый старый
//    afterStream = ints.stream()
//        .sorted()
//        .filter(new PositiveFilter())
//        .collect(Collectors.toList());
    // 2 вариант - анонимный класс, основной вариант до 8 версии
//    afterStream = ints.stream()
//        .sorted()
//        .filter(new Predicate<Integer>() {
//          @Override
//          public boolean test(Integer integer) {
//            return integer > 0;
//          }
//        })
//        .collect(Collectors.toList());
    // 3 вариант - лямбда выражения, основной вариант с 8 версии
//    afterStream = ints.stream()
//        .sorted()
//        .filter(x -> x > 0)
//        .collect(Collectors.toList());

//    List<Boolean> afterStream2;
//    afterStream2 = ints.stream()
//        .map(x -> x > 0)
//        .collect(Collectors.toList());

    afterStream = ints.stream()
        .map(x -> x * x)
        .limit(5)
        .skip(1)
        .peek(System.out::println)
        .collect(ArrayList::new, ArrayList::add,
            ArrayList::addAll);

    int sum = ints.stream()
            .reduce(0, (acc, x) -> acc += x);
    int prod = ints.stream()
            .reduce(1, (acc, x) -> acc *= x);
    System.out.println(sum + " " + prod);

    System.out.println(afterStream);
//    System.out.println(afterStream2);

    Client c1 = new Client("b", 23, "2");
    Client c2 = new Client("a", 21, "3");
    ArrayList<Client> clients = new ArrayList<>();
    clients.add(c1);
    clients.add(c2);

//    clients.sort(Comparator.comparing(client -> client.login));
    clients.sort(Comparator.comparingInt(client -> client.age));
    System.out.println(clients);
  }

  public static void main(String[] args) {
//    clientDAO();
    streamAPI();
  }
}

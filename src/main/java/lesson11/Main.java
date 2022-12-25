package lesson11;


import lesson8.Person;

import java.sql.*;
import java.util.ArrayList;

public class Main {
  static void jdbcExample() {
    // Всё, что относится к JDBC, находится в java.sql пакете
    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:test.db")) {
      // Statement - объект, которому можно задавать команды SQL
      Statement stat = connection.createStatement();
//      stat.executeUpdate("INSERT INTO persons(id, name, age) VALUES (3, 'Yulia', 23)");

      ResultSet rs = stat.executeQuery("SELECT * FROM persons");
      while (rs.next()) {
        System.out.printf("person with id=%d, name='%s', age=%d\n",
            rs.getInt("id"),
            rs.getString("name"),
            rs.getInt("age"));
      }
    } catch (SQLException throwables) {
      System.out.println(throwables.getErrorCode() + " " + throwables.getMessage());
    }
  }


  static void task12() {

    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:chinook.db")) {
      Statement stat = connection.createStatement();

      ResultSet rs = stat.executeQuery("SELECT * FROM artists");
      // Взятие без ограничений
//       rs = stat.executeQuery("SELECT * FROM tracks");
      // Фильтрация результата
//       rs = stat.executeQuery("SELECT * FROM tracks WHERE milliseconds BETWEEN 90000 AND 180000");
//       rs = stat.executeQuery("SELECT * FROM tracks WHERE milliseconds BETWEEN 90000 AND 180000");
//      while (rs.next()) {
//        System.out.printf("Track '%s'\n\t genre:%d length: %.3f\n",
//            rs.getString("name"),
//            rs.getInt("genreid"),
//            rs.getInt("milliseconds") / 1000.0);
//      }
//      rs = stat.executeQuery("SELECT genreid, " +
//          "count(*) AS track_count, " +
//          "AVG(milliseconds) AS avg_length, " +
//          "MAX(milliseconds) AS max FROM tracks GROUP BY genreid");
//      while (rs.next()) {
//        System.out.printf("Genre: %d\n\tNumber of tracks: %d, max length: %.3f, average length: %.3f\n",
//            rs.getInt("genreid"),
//            rs.getInt("track_count"),
//            rs.getInt("max") / 1000.0,
//            rs.getDouble("avg_length") / 1000);
//      }
//      rs = stat.executeQuery("SELECT * FROM tracks WHERE genreid=19 ORDER BY milliseconds DESC");
//      while (rs.next()) {
//        System.out.printf("Track '%s'\n\t genre:%d length: %.3f\n",
//            rs.getString("name"),
//            rs.getInt("genreid"),
//            rs.getInt("milliseconds") / 1000.0);
//      }
//      rs = stat.executeQuery("SELECT * ");

    } catch (SQLException throwables) {
      System.out.println(throwables.getMessage());
    }
  }

  static void jdbcExample2() {
    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:musicstore.db")) {
      // Statement - объект, которому можно задавать команды SQL
      Statement stat = connection.createStatement();

      stat.executeUpdate("DROP TABLE IF EXISTS artists");
      // Создание базовой таблицы
//      stat.executeUpdate("CREATE TABLE IF NOT EXISTS artists(" +
//          "artist_id INT PRIMARY KEY, " +
//          "name TEXT NOT NULL, " +
//          "created_at TEXT)");
      // Создание таблицы с автоинкрементом идентификатора и значением по умолчанию для даты
      stat.executeUpdate("CREATE TABLE IF NOT EXISTS artists(" +
          "artist_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
          "name TEXT NOT NULL, " +
          "created_at INTEGER DEFAULT CURRENT_TIMESTAMP)");

      // Добавление строк в таблицу
      stat.executeUpdate("INSERT INTO artists(name) VALUES ('Linkin Park')");
      stat.executeUpdate("INSERT INTO artists(name) VALUES ('Paramore')");

      // Изменение колонок строк, прошедших фильтр
//      stat.executeUpdate("UPDATE artists SET artist_id=1 WHERE name='Linkin Park'");
      // Удаление строк, найденных по фильтру
//      stat.executeUpdate("DELETE FROM artists WHERE artist_id=1");


    } catch (SQLException throwables) {
      System.out.println(throwables.getErrorCode() + " " + throwables.getMessage());
    }
  }

  static void preparedStatements() {
    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:test.db")) {
      Statement stat = connection.createStatement();

      ArrayList<Person> persons = new ArrayList<>();
      for (int i = 0; i < persons.size(); i++) {
        Person p = persons.get(i);
        stat.executeUpdate("INSERT INTO persons(id, name, age) VALUES (" + i + ", '" + p.name + "', " + p.age + ")");
      }

      PreparedStatement statementToInsertPerson = connection.prepareStatement("INSERT INTO persons(id, name, age) VALUES (?, ?, ?)");
      for (int i = 0; i < persons.size(); i++) {
        Person p = persons.get(i);
        statementToInsertPerson.setInt(1, i);
        statementToInsertPerson.setString(2, p.name);
        statementToInsertPerson.setInt(3, p.age);
        statementToInsertPerson.execute();
      }

    } catch (SQLException throwables) {
      System.out.println(throwables.getErrorCode() + " " + throwables.getMessage());
    }
  }

  public static void main(String[] args) {
//    jdbcExample();
//    jdbcExample2();
    task12();
  }
}

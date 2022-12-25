package lesson11;

import java.sql.*;

public class HW1 {

  static void HW1(){
    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:chinook.db")){

      Statement stat = connection.createStatement();
      ResultSet rs = stat.executeQuery("SELECT * FROM customers");
      while (rs.next()) {

        System.out.printf("person with Firsname:'%s'\n Lastname:%s Email: %s\n",
                rs.getString("Firstname"),
                rs.getString("Lastname"),
                rs.getString("Email"));
      }




    } catch (SQLException e) {
      System.out.printf(e.getMessage());;
    }
  }

  static void HW2(){
    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:chinook.db")){

      Statement stat = connection.createStatement();
      ResultSet rs = stat.executeQuery("SELECT * FROM invoice_items WHERE UnitPrice > 1   ");
      while (rs.next()) {
        System.out.printf("Track № '%d' bought for more than 1 y.e.\n",
                rs.getInt("TrackID"));

      }




    } catch (SQLException e) {
      System.out.printf(e.getMessage());;
    }

  }


  static void HW3(){
    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:chinook.db")){

      Statement stat = connection.createStatement();
      ResultSet   rs = stat.executeQuery("SELECT Tittle, Name FROM albums INNER JOIN artists ON artists artists.artistID = album.artistId");
      System.out.printf("Tittle '%s', Name '%s'\n",
              rs.getInt("Tittle"),
              rs.getString("Name"));







    } catch (SQLException e) {
      System.out.printf(e.getMessage());;
    }

  }


  public static void main(String[] args) {
//        HW1();
//        HW2();
    HW3();
  }


}

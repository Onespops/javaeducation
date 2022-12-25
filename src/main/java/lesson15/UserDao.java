package lesson15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.sqlite.SQLiteDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
@Scope("prototype")
public class UserDao {

  DataSource dataSource;

  public UserDao(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Transactional
  public User findById(long id) {
    // Поиск юзера в таблице с юзерами по идентификатору
    try (Connection connection = dataSource.getConnection()) {
      PreparedStatement findByIdStat = connection.prepareStatement("select * from users where id=?");
      // ..
    } catch (SQLException throwables) {
      System.out.println(throwables.getMessage());
    }
    return null;
  }

  public User findByName(String name) {
    try (Connection connection = dataSource.getConnection()) {
      PreparedStatement findByIdStat = connection.prepareStatement("select * from users where name=?");
      // ..
    } catch (SQLException throwables) {
      System.out.println(throwables.getMessage());
    }
    return null;
  }

  public DataSource newDataSource() {
    SQLiteDataSource dataSource = new SQLiteDataSource();
    dataSource.setUrl("jdbc:sqlite:chinook.db");
    return dataSource;
  }
}

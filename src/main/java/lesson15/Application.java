package lesson15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.sqlite.SQLiteDataSource;
import javax.sql.DataSource;
import javax.xml.crypto.Data;

@Configuration
@ComponentScan
public class Application {
//  private static DataSource dataSource;
//
//  public static DataSource getDataSource() {
//    if (dataSource == null) {
//      SQLiteDataSource dataSource = new SQLiteDataSource();
//      dataSource.setUrl("jdbc:sqlite:chinook.db");
//      Application.dataSource = dataSource;
//    }
//    return dataSource;
//  }

  @Bean
  @Scope("singleton")
  public DataSource dataSource() {
    SQLiteDataSource dataSource = new SQLiteDataSource();
    dataSource.setUrl("jdbc:sqlite:chinook.db");
    return dataSource;
  }

  // если не было бы @ComponentScan у Application и @Component у UserDao
//  @Bean
//  @Scope("prototype")
//  public UserDao userDao() {
//    return new UserDao(dataSource());
//  }

  public static void main(String[] args) {
//    UserDao userDao = new UserDao();
    ApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);
    UserDao userDao = ctx.getBean(UserDao.class);
    UserDao userDao1 = ctx.getBean(UserDao.class);

    DataSource dataSource = ctx.getBean(DataSource.class);

    System.out.println(userDao);
    System.out.println(userDao1);
    System.out.println(userDao1.dataSource);
    System.out.println(userDao.dataSource);
    System.out.println(dataSource);
  }
}

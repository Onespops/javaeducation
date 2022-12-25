package lesson12;

//@Entity
public class Client {
//  @Id
//  @Column(name="client_id", g)
  long id;
  String login;
  int age;
  String password;

  public Client() {
  }

  public Client(String login, int age, String password) {
    this.login = login;
    this.age = age;
    this.password = password;
  }

  public Client(long id, String login, int age, String password) {
    this.id = id;
    this.login = login;
    this.age = age;
    this.password = password;
  }

  @Override
  public String toString() {
    return "Client{" +
        "id=" + id +
        ", login='" + login + '\'' +
        ", age=" + age +
        ", password='" + password + '\'' +
        '}';
  }
}

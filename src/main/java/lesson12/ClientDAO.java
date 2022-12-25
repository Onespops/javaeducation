package lesson12;

import java.sql.*;
import java.util.LinkedList;

public class ClientDAO {
  private static final String sqlToAddClient = "INSERT INTO clients(login, age, password) VALUES (?,?,?)";
  private static final String sqlToChangeClient = "UPDATE clients SET login=?, age=?, password=? WHERE client_id=?";
  private static final String sqlToDeleteClient = "DELETE FROM clients WHERE client_id=?";
  private static final String sqlToGetAllClients = "SELECT * FROM clients";
  private static final String sqlToGetClientById = "SELECT * FROM clients WHERE client_id=?";

  private final Connection connection;
  private final Statement statement;

  private final PreparedStatement addClient;
  private final PreparedStatement changeClient;
  private final PreparedStatement deleteClient;
  private final PreparedStatement getClientById;

  public ClientDAO(Connection connection) throws SQLException{
    this.connection = connection;
    statement = connection.createStatement();

    addClient = connection.prepareStatement(sqlToAddClient);
    changeClient = connection.prepareStatement(sqlToChangeClient);
    deleteClient = connection.prepareStatement(sqlToDeleteClient);
    getClientById = connection.prepareStatement(sqlToGetClientById);
  }

  // CRUD (Create, Read, Update, Delete)
  // изменить void -> long
  public void add(Client client) throws SQLException {
    addClient.setString(1, client.login);
    addClient.setInt(2, client.age);
    addClient.setString(3, client.password);
    addClient.executeUpdate();
  }

  public LinkedList<Client> getAll() throws SQLException {
    LinkedList<Client> clients = new LinkedList<>();
    ResultSet rs = statement.executeQuery(sqlToGetAllClients);
    while (rs.next()) {
      Client tempClient = new Client(
          rs.getLong("client_id"),
          rs.getString("login"),
          rs.getInt("age"),
          rs.getString("password")
      );
      clients.add(tempClient);
    }
    return clients;
  }

  public Client getById(long id) throws SQLException {
    getClientById.setLong(1, id);
    ResultSet rs = getClientById.executeQuery();
    long foundId = rs.getLong("client_id");
    if (foundId != 0) {
      return new Client(
          rs.getLong("client_id"),
          rs.getString("login"),
          rs.getInt("age"),
          rs.getString("password")
      );
    } else {
      return null;
    }
  }

  public void delete(long id) throws SQLException {
    deleteClient.setLong(1, id);
    deleteClient.executeUpdate();
  }

  public boolean change(long id, String newName, int newAge, String newPassword) throws SQLException {
    getClientById.setLong(1, id);
    ResultSet rs = getClientById.executeQuery();
    long foundId = rs.getLong("client_id");
    if (foundId != 0) {
      changeClient.setLong(4, foundId);
      changeClient.setString(1, newName);
      changeClient.setInt(2, newAge);
      changeClient.setString(3, newPassword);
      changeClient.executeUpdate();
      return true;
    } else {
      return false;
    }
  }

  public boolean birthday(long id) throws SQLException {
    Client birthdayClient = getById(id);
    if (birthdayClient != null) {
      change(id, birthdayClient.login, birthdayClient.age + 1, birthdayClient.password);
      return true;
    } else {
      return false;
    }
  }
}

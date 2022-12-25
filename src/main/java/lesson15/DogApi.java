package lesson15;

public class DogApi {
  String message;
  String status;

  public DogApi() {
  }

  public DogApi(String message, String status) {
    this.message = message;
    this.status = status;
  }

  @Override
  public String toString() {
    return "DogApi{" +
        "message='" + message + '\'' +
        ", status='" + status + '\'' +
        '}';
  }
}

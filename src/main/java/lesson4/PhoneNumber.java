package lesson4;

public class PhoneNumber {
  String numType;
  long num;

  public PhoneNumber() {
  }

  public PhoneNumber(String numType, long num) {
    this.numType = numType;
    this.num = num;
  }

  void print() {
    System.out.println(numType + " номер: " + num);
  }

  void changeType(String newType) {
    numType = newType;
  }

  long getNum() {
    return num;
  }
}


package lesson18;


public class CustomAnnoExample {
  @CustomAnnotation(name="i")
  int i;
  @CustomAnnotation(name="val")
  String val;
  boolean noAnnotation;

  @CustomAnnotation(name="example", type=1)
  void example() {
  }

  @CustomAnnotation(name="example2", type=1)
  void example2() {
  }
}

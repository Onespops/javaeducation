package lesson5;


import java.util.Objects;

public abstract class Plant {
  double height;
  double width;
  String name; // относится к HW3

  public Plant() {
  }

  public Plant(double height, double width) {
    this.height = height;
    this.width = width;
  }

  public abstract void grow();

  // относится к HW3
  @Override
  public String toString() {
    return "Plant{" +
        "height=" + height +
        ", width=" + width +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Plant plant = (Plant) o;
    return Double.compare(plant.height, height) == 0
        && Double.compare(plant.width, width) == 0
        && name.equals(plant.name);

  }

  @Override
  public int hashCode() {
    return Objects.hash(height, width, name);
  }
}

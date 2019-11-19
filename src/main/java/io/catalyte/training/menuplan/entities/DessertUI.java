package io.catalyte.training.menuplan.entities;

public class DessertUI {

  private String name;
  protected DessertUI() {
  }

  public DessertUI(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("Dessert[name='%s']", name);
  }
}

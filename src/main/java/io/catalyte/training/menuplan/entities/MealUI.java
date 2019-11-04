package io.catalyte.training.menuplan.entities;

public class MealUI {

  private String name;
  protected MealUI() {
  }

  public MealUI(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String toString() {
    return String.format("Meal[name='%s']", name);
  }
}

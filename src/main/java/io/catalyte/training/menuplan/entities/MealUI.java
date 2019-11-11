package io.catalyte.training.menuplan.entities;

public class MealUI {
  private String name;
  private long mainDishId;

  protected MealUI() {
  }

  public MealUI(String name, long mainDishId) {
    this.name = name;
    this.mainDishId = mainDishId;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public long getMainDishId() {
    return mainDishId;
  }

  public void setMainDishId(long mainDishId) {
    this.mainDishId = mainDishId;
  }

  public String toString() {
    return String.format("Meal[name='%s']", name);
  }
}

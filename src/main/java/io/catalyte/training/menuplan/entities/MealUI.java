package io.catalyte.training.menuplan.entities;

public class MealUI {

  private String mealName;
  protected MealUI() {
  }

  public MealUI(String mealName) {
    this.mealName = mealName;
  }

  public String getMealName() {
    return mealName;
  }
  public void setMealName(String mealName) {
    this.mealName = mealName;
  }

  public String toString() {
    return String.format("Meal[mealName='%s']", mealName);
  }
}

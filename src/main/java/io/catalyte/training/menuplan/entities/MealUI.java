package io.catalyte.training.menuplan.entities;

public class MealUI {
  private String name;
  private String mainDishName;
  private String dessertName;

  protected MealUI() {
  }

  public MealUI(String name, String mainDishName, String dessertName) {
    this.name = name;
    this.mainDishName = mainDishName;
    this.dessertName = dessertName;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getMainDishName() {
    return mainDishName;
  }
  public void setMainDishName(String mainDishName) {
    this.mainDishName = mainDishName;
  }

  public String getDessertName() {
    return dessertName;
  }

  public void setDessertName(String dessertName) {
    this.dessertName = dessertName;
  }

  public String toString() {
    return String.format("Meal[name='%s']", name);
  }
}

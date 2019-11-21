package io.catalyte.training.menuplan.entities;

public class MealUI {
  private String name;
  private String mainDishName;
  private String sideDishName;
  private String dessertName;

  protected MealUI() {
  }

  public MealUI(String name, String mainDishName, String sideDishName, String dessertName) {
    this.name = name;
    this.mainDishName = mainDishName;
    this.sideDishName = sideDishName;
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

  public String getSideDishName() {
    return sideDishName;
  }

  public void setSideDishName(String sideDishName) {
    this.sideDishName = sideDishName;
  }

  public String getDessertName() {
    return dessertName;
  }

  public void setDessertName(String dessertName) {
    this.dessertName = dessertName;
  }

  @Override
  public String toString() {
    return "MealUI{" +
      "name='" + name + '\'' +
      ", mainDishName='" + mainDishName + '\'' +
      ", sideDishName='" + sideDishName + '\'' +
      ", dessertName='" + dessertName + '\'' +
      '}';
  }
}

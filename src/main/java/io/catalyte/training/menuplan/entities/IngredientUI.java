package io.catalyte.training.menuplan.entities;

public class IngredientUI {

  private String name;
  protected IngredientUI() {
  }

  public IngredientUI(String name) {
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
    return String.format("Ingredient[name='%s']", name);
  }
}

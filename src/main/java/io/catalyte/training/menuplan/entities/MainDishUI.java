package io.catalyte.training.menuplan.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

public class MainDishUI {

  private String name;
  protected MainDishUI() {
  }

  public MainDishUI(String name) {
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
    return String.format("MainDish[name='%s']", name);
  }
}

package io.catalyte.training.menuplan.entities;

import javax.persistence.Entity;

@Entity
public class MainDish extends Recipe {

  protected MainDish() {
  }

  public MainDish(String name) {
    this.setName(name);
  }

  @Override
  public String toString() {
    return String.format("MainDish Dish[name='%s']", this.getName());
  }
}

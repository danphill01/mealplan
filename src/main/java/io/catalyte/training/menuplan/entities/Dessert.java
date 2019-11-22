package io.catalyte.training.menuplan.entities;

import javax.persistence.Entity;

@Entity
public class Dessert extends Recipe {

  protected Dessert() {
  }

  public Dessert(String name) {
    this.setName(name);
  }

  @Override
  public String toString() {
    return String.format("Dessert[name='%s']", this.getName());
  }
}

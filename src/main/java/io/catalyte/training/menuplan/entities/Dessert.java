package io.catalyte.training.menuplan.entities;

import java.util.Set;
import javax.persistence.Entity;

@Entity
public class Dessert extends Recipe {

  protected Dessert() {}

  public Dessert(String name, Set<Component> component) {
    this.setName(name);
    this.setComponent(component);
  }

  @Override
  public String toString() {
    return String.format("Dessert[name='%s']", this.getName());
  }
}

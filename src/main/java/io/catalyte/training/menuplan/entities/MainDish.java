package io.catalyte.training.menuplan.entities;

import java.util.Set;
import javax.persistence.Entity;

@Entity
public class MainDish extends Recipe {

  protected MainDish() {
  }

  public MainDish(String name, Set<Component> component) {
    this.setName(name);
    this.setComponent(component);
  }

  @Override
  public String toString() {
    return String.format("MainDish[name='%s']", this.getName());
  }
}

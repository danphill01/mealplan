package io.catalyte.training.menuplan.entities;

import java.util.Set;
import javax.persistence.Entity;

@Entity
public class SideDish extends Recipe {

  public SideDish() {}

  public SideDish(String name, Set<Component> component) {
    this.setName(name);
    this.setComponent(component);
  }

  @Override
  public String toString() {
    return String.format("SideDish[name='%s']", this.getName());
  }
}

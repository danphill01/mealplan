package io.catalyte.training.menuplan.entities;

import javax.persistence.Entity;

@Entity
public class SideDish extends Recipe {

  public SideDish() {}

  public SideDish(String name) {
    this.setName(name);
  }

  @Override
  public String toString() {
    return String.format("SideDish[name='%s']", this.getName());
  }
}

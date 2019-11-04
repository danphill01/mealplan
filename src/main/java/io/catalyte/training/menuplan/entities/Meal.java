package io.catalyte.training.menuplan.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "meal")
public class Meal extends BaseEntity {

  protected Meal() {
  }

  public Meal(String name) {
    this.setName(name);
  }

  @Override
  public String toString() {
    return String.format("Meal[id=%d, name='%s']", this.getId(), this.getName());
  }
}

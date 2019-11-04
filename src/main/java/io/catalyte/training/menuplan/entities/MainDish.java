package io.catalyte.training.menuplan.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "main")
public class MainDish extends BaseEntity {

  protected MainDish() {
  }

  public MainDish(String name) {
    this.setName(name);
  }

  @Override
  public String toString() {
    return String.format("MainDish Dish[id=%d, name='%s']", this.getId(), this.getName());
  }
}

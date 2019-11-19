package io.catalyte.training.menuplan.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Meal extends BaseEntity {
  @ManyToOne()
  private MainDish mainDish;

  protected Meal() {
  }

  public Meal(String name, MainDish mainDish) {
    this.setName(name);
    this.mainDish = mainDish;
  }

  public MainDish getMainDish() {
    return mainDish;
  }

  public void setMainDish(MainDish mainDish) {
    this.mainDish = mainDish;
  }

  @Override
  public String toString() {
    return String.format("Meal[id=%d, name='%s']", this.getId(), this.getName());
  }
}

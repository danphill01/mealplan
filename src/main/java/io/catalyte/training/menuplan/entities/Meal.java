package io.catalyte.training.menuplan.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Meal extends BaseEntity {
  @ManyToOne()
  private MainDish mainDish;
  @ManyToOne()
  private Dessert dessert;

  protected Meal() {
  }

  public Meal(String name, MainDish mainDish, Dessert dessert) {
    this.setName(name);
    this.mainDish = mainDish;
    this.dessert = dessert;
  }

  public MainDish getMainDish() {
    return mainDish;
  }

  public void setMainDish(MainDish mainDish) {
    this.mainDish = mainDish;
  }

  public String getMainDishName() { return mainDish.getName(); }

  public Dessert getDessert() {
    return dessert;
  }

  public void setDessert(Dessert dessert) {
    this.dessert = dessert;
  }

  public String getDessertName() { return dessert.getName(); }

  @Override
  public String toString() {
    return String.format("Meal[id=%d, name='%s']", this.getId(), this.getName());
  }
}

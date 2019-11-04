package io.catalyte.training.menuplan.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "meal")
public class Meal extends BaseEntity {

  @Column(name = "mealName")
  private String mealName;

  protected Meal() {
  }

  public Meal(String mealName) {
    this.mealName = mealName;
  }

  @Override
  public String toString() {
    return String.format("Meal[id=%d, mealName='%s']", this.getId(), mealName);
  }
  public String getMealName() {
    return mealName;
  }
}

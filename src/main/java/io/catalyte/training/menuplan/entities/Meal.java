package io.catalyte.training.menuplan.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "meal")
public class Meal extends BaseEntity {
  @Column(name = "main_dish_id")
  private long mainDishId;

  protected Meal() {
  }

  public Meal(String name, long mainDishId) {
    this.setName(name);
    this.setMainDishId(mainDishId);
  }

  public long getMainDishId() {
    return mainDishId;
  }

  public void setMainDishId(long mainDishId) {
    this.mainDishId = mainDishId;
  }

  @Override
  public String toString() {
    return String.format("Meal[id=%d, name='%s']", this.getId(), this.getName());
  }
}

package io.catalyte.training.menuplan.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "main")
public class MainDish {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Column(unique = true)
  private String name;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  protected MainDish() {
  }

  public MainDish(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("MainDish Dish[id=%d, name='%s']", this.getId(), this.getName());
  }
}

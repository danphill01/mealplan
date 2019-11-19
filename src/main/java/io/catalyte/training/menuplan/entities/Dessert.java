package io.catalyte.training.menuplan.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dessert {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Column(name = "name")
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

  protected Dessert() {
  }

  public Dessert(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("Dessert[id=%d, name='%s']", this.getId(), this.getName());
  }
}

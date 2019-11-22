package io.catalyte.training.menuplan.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Meal {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO) private long id;
  @Column(name = "name") private String name;
  @ManyToOne() private MainDish mainDish;
  @ManyToOne() private SideDish sideDish;
  @ManyToOne() private Dessert dessert;

  protected Meal() {}

  public Meal(String name, MainDish mainDish, SideDish sideDish, Dessert dessert) {
    this.name = name;
    this.mainDish = mainDish;
    this.sideDish = sideDish;
    this.dessert = dessert;
  }

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

  public MainDish getMainDish() {
    return mainDish;
  }

  public void setMainDish(MainDish mainDish) {
    this.mainDish = mainDish;
  }

  public String getMainDishName() {
    return mainDish.getName();
  }

  public SideDish getSideDish() {
    return sideDish;
  }

  public void setSideDish(SideDish sideDish) {
    this.sideDish = sideDish;
  }

  public String getSideDishName() {
    return this.sideDish.getName();
  }

  public Dessert getDessert() {
    return dessert;
  }

  public void setDessert(Dessert dessert) {
    this.dessert = dessert;
  }

  public String getDessertName() {
    return dessert.getName();
  }

  @Override
  public String toString() {
    return "Meal{" +
      "mainDish=" + mainDish +
      ", sideDish=" + sideDish +
      ", dessert=" + dessert +
      '}';
  }
}

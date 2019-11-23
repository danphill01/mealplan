package io.catalyte.training.menuplan.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Component {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @ManyToOne private Ingredient ingredient;

  private double quantity;

  protected Component() {}

  public Component(Ingredient ingredient, double quantity) {
    this.ingredient = ingredient;
    this.quantity = quantity;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public double getQuantity() {
    return quantity;
  }

  public void setQuantity(double quantity) {
    this.quantity = quantity;
  }

  public Ingredient getIngredient() {
    return ingredient;
  }

  public void setIngredient(Ingredient ingredient) {
    this.ingredient = ingredient;
  }

  @Override
  public String toString() {
    return "Component{" +
      "ingredient=" + ingredient +
      ", quantity=" + quantity +
      '}';
  }
}

package io.catalyte.training.menuplan.entities;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

public class MainDishUI {

  private String name;
  private Set<Component> components;

  protected MainDishUI() {
  }

  public MainDishUI(String name,
    Set<Component> components) {
    this.name = name;
    this.components = components;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Component> getComponents() {
    return components;
  }

  public void setComponents(Set<Component> components) {
    this.components = components;
  }

  @Override
  public String toString() {
    return "MainDishUI{" +
      "name='" + name + '\'' +
      ", components=" + components +
      '}';
  }
}

package io.catalyte.training.menuplan.entities;

import java.util.Set;

public class DessertUI {

  private String name;
  private Set<Component> components;

  protected DessertUI() {}

  public DessertUI(String name, Set<Component> components) {
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
    return "DessertUI{" +
      "name='" + name + '\'' +
      ", components=" + components +
      '}';
  }
}

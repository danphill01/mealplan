package io.catalyte.training.menuplan.entities;

public class SideDishUI {

  private String name;

  protected SideDishUI() {}

  public SideDishUI(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("SideDish[name='%s']", name);
  }
}

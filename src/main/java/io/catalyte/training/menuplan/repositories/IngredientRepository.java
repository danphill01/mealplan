package io.catalyte.training.menuplan.repositories;

import io.catalyte.training.menuplan.entities.Ingredient;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
  Ingredient findByName(String name);
  List<Ingredient> findAll();
}

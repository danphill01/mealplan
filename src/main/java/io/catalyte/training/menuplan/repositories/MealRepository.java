package io.catalyte.training.menuplan.repositories;

import io.catalyte.training.menuplan.entities.Meal;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal, Long> {
  Optional<Meal> findByName(String name);
  List<Meal> findAll();
}

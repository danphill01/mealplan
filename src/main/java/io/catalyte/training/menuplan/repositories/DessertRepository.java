package io.catalyte.training.menuplan.repositories;

import io.catalyte.training.menuplan.entities.Dessert;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DessertRepository extends JpaRepository<Dessert, Long> {
  Dessert findByName(String name);
  List<Dessert> findAll();
}

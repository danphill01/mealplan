package io.catalyte.training.menuplan.repository;

import io.catalyte.training.menuplan.entities.Dessert;
import io.catalyte.training.menuplan.entities.MainDish;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DessertRepository extends JpaRepository<Dessert, Long> {
  List<Dessert> findByName(String name);
  List<Dessert> findAll();
}

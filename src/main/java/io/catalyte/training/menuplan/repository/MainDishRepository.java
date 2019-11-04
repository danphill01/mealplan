package io.catalyte.training.menuplan.repository;

import io.catalyte.training.menuplan.entities.MainDish;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainDishRepository extends JpaRepository<MainDish, Long> {
  List<MainDish> findByName(String name);
  List<MainDish> findAll();
}

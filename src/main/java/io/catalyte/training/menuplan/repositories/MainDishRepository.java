package io.catalyte.training.menuplan.repositories;

import io.catalyte.training.menuplan.entities.MainDish;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainDishRepository extends JpaRepository<MainDish, Long> {
  MainDish findByName(String name);
  List<MainDish> findAll();
}


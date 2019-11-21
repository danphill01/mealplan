package io.catalyte.training.menuplan.repository;

import io.catalyte.training.menuplan.entities.SideDish;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SideDishRepository extends JpaRepository<SideDish, Long> {
  SideDish findByName(String name);
  List<SideDish> findAll();
}

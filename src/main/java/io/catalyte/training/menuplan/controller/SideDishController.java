package io.catalyte.training.menuplan.controller;

import io.catalyte.training.menuplan.entities.SideDish;
import io.catalyte.training.menuplan.entities.SideDishUI;
import io.catalyte.training.menuplan.exception.ConflictException;
import io.catalyte.training.menuplan.repository.SideDishRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/sidedishes")
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class SideDishController {
  @Autowired private SideDishRepository sideDishRepository;

  @GetMapping
  public List<SideDishUI> findAll() {
    List<SideDish> sideDishes = sideDishRepository.findAll();
    List<SideDishUI> sideDishUI = new ArrayList<>();

    for (SideDish sideDish : sideDishes) {
      sideDishUI.add(new SideDishUI(sideDish.getName()));
    }
    return sideDishUI;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public SideDish create(@RequestBody SideDishUI newSideDish) {
    try {
      return sideDishRepository.save(new SideDish(newSideDish.getName()));
    } catch (DataIntegrityViolationException dive) {
      throw new ConflictException(dive, "Main Dish", newSideDish.getName());
    }
  }
}

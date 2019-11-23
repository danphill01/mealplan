package io.catalyte.training.menuplan.controllers;

import io.catalyte.training.menuplan.entities.SideDish;
import io.catalyte.training.menuplan.entities.SideDishUI;
import io.catalyte.training.menuplan.exceptions.ConflictException;
import io.catalyte.training.menuplan.repositories.SideDishRepository;
import io.catalyte.training.menuplan.services.SideDishService;
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
  @Autowired private SideDishRepository repository;
  @Autowired private SideDishService service;

  @GetMapping
  public List<SideDishUI> findAll() {
    List<SideDish> sideDishes = repository.findAll();
    List<SideDishUI> sideDishUI = new ArrayList<>();

    for (SideDish sideDish : sideDishes) {
      sideDishUI.add(new SideDishUI(sideDish.getName(), sideDish.getComponent()));
    }
    return sideDishUI;
  }

  @GetMapping("/random")
  public SideDishUI pickRandomMainDishes() {
    return service.pickRandom();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public SideDish create(@RequestBody SideDishUI newSideDish) {
    try {
      return repository.save(new SideDish(newSideDish.getName(), newSideDish.getComponents()));
    } catch (DataIntegrityViolationException dive) {
      throw new ConflictException(dive, "Main Dish", newSideDish.getName());
    }
  }
}

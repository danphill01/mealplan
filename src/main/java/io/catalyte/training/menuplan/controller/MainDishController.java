package io.catalyte.training.menuplan.controller;

import io.catalyte.training.menuplan.entities.MainDish;
import io.catalyte.training.menuplan.entities.MainDishUI;
import io.catalyte.training.menuplan.exception.ConflictException;
import io.catalyte.training.menuplan.repository.MainDishRepository;
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

@RequestMapping("/maindishes")
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class MainDishController {
  @Autowired private MainDishRepository mainDishRepository;

  @GetMapping
  public List<MainDishUI> findAll() {
    List<MainDish> mainDishes = mainDishRepository.findAll();
    List<MainDishUI> mainDishUI = new ArrayList<>();

    for (MainDish mainDish : mainDishes) {
      mainDishUI.add(new MainDishUI(mainDish.getName()));
    }
    return mainDishUI;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public MainDish create(@RequestBody MainDishUI newMainDish) {
    try {
      return mainDishRepository.save(new MainDish(newMainDish.getName()));
    } catch (DataIntegrityViolationException dive) {
      throw new ConflictException(dive, "Main Dish", newMainDish.getName());
    }
  }
}

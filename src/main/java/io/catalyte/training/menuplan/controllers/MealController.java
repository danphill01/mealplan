package io.catalyte.training.menuplan.controllers;

import io.catalyte.training.menuplan.entities.Dessert;
import io.catalyte.training.menuplan.entities.MainDish;
import io.catalyte.training.menuplan.entities.Meal;
import io.catalyte.training.menuplan.entities.MealUI;
import io.catalyte.training.menuplan.entities.SideDish;
import io.catalyte.training.menuplan.exceptions.ConflictException;
import io.catalyte.training.menuplan.exceptions.EntityNotFoundException;
import io.catalyte.training.menuplan.repositories.DessertRepository;
import io.catalyte.training.menuplan.repositories.MainDishRepository;
import io.catalyte.training.menuplan.repositories.MealRepository;
import io.catalyte.training.menuplan.repositories.SideDishRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mealplans")
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class MealController {
  @Autowired private MealRepository mealRepository;
  @Autowired private MainDishRepository mainDishRepository;
  @Autowired private SideDishRepository sideDishRepository;
  @Autowired private DessertRepository dessertRepository;

  @PostMapping
  public Meal create(@RequestBody MealUI meal) {
    MainDish mainDish = mainDishRepository.findByName(meal.getMainDishName());
    SideDish sideDish = sideDishRepository.findByName(meal.getSideDishName());
    Dessert dessert = dessertRepository.findByName(meal.getDessertName());
    try {
      return mealRepository.save(new Meal(meal.getName(), mainDish, sideDish, dessert));
    } catch (DataIntegrityViolationException dive) {
      throw new ConflictException(dive, "Meal", meal.getName());
    }
  }

  @GetMapping
  public List<MealUI> readAll() {
    List<Meal> meals = mealRepository.findAll();
    List<MealUI> mealUI = new ArrayList<>();

    for (Meal meal : meals) {
      mealUI.add(new MealUI(meal.getName(), meal.getMainDishName(), meal.getSideDishName(), meal.getDessertName()));
    }

    return mealUI;
  }

  @RequestMapping("/{id}")
  public String readById(@PathVariable long id) {
    Optional<Meal> meal = mealRepository.findById(id);
    if (meal.isPresent()) {
      return meal.get().toString();
    } else {
      throw new EntityNotFoundException("Meal", id);
    }
  }

  @RequestMapping("/searchbymealname/{mealName}")
  public MealUI fetchDataByMealName(@PathVariable String mealName) {
    Optional<Meal> meal = mealRepository.findByName(mealName);
    if (meal.isPresent()) {
      Meal foundMeal = meal.get();
      return new MealUI(foundMeal.getName(), foundMeal.getMainDishName(), foundMeal.getSideDishName(), foundMeal.getDessertName());
    } else {
      throw new EntityNotFoundException("Meal", mealName);
    }
  }
}

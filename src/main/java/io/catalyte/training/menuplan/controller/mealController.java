package io.catalyte.training.menuplan.controller;

import io.catalyte.training.menuplan.entities.Meal;
import io.catalyte.training.menuplan.entities.MealUI;
import io.catalyte.training.menuplan.exception.EntityNotFoundException;
import io.catalyte.training.menuplan.repository.MealRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mealController {
  @Autowired
  MealRepository repository;

  @GetMapping("/bulkcreate")
  public String bulkcreate(){
    //save a single meal
    repository.save(new Meal("Chili con Carne"));
    //save multiple meals
    repository.saveAll(Arrays.asList(new Meal("Chicken and Rice")
    , new Meal("Fish Soup")
    , new Meal("Pork Chops")));
    return "Meals are bulk created";
  }

  @PostMapping("/create")
  public String create(@RequestBody MealUI meal){
    //save a single meal
    repository.save(new Meal(meal.getMealName()));

    return "Meal is created";
  }

  @GetMapping("/findall")
  public List<MealUI> findAll(){
    List<Meal> meals = repository.findAll();
    List<MealUI> mealUI = new ArrayList<>();

    for (Meal meal : meals) {
      mealUI.add(new MealUI(meal.getMealName()));
    }

    return mealUI;
  }

  @RequestMapping("/search/{id}")
  public String search(@PathVariable long id){
    Optional<Meal> meal = repository.findById(id);
    if (meal.isPresent()) {
      return meal.get().toString();
    } else {
      throw new EntityNotFoundException("Meal", id);
    }
  }

  @RequestMapping("/searchbymealname/{mealName}")
  public List<MealUI> fetchDataByMealName(@PathVariable String mealName){
    List<Meal> meals = repository.findByMealName(mealName);
    List<MealUI> mealUI = new ArrayList<>();

    for (Meal meal : meals) {
      mealUI.add(new MealUI(meal.getMealName()));
    }
    return mealUI;
  }
}

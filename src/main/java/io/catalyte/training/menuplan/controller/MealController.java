package io.catalyte.training.menuplan.controller;

import io.catalyte.training.menuplan.entities.MainDish;
import io.catalyte.training.menuplan.entities.Meal;
import io.catalyte.training.menuplan.entities.MealUI;
import io.catalyte.training.menuplan.exception.EntityNotFoundException;
import io.catalyte.training.menuplan.repository.MainDishRepository;
import io.catalyte.training.menuplan.repository.MealRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
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
  @Autowired
  private MealRepository mealRepository;
  @Autowired
  private MainDishRepository mainDishRepository;

  @GetMapping("/bulkcreate")
  public String bulkcreate(){
    List<MainDish> mainDishes = mainDishRepository.saveAll(Arrays.asList(new MainDish("Chili con Carne")
        , new MainDish("Baked Chicken")
        , new MainDish("Baked Fish")
        , new MainDish("Breaded Pork Chops")));
    //save multiple meals
    mealRepository.saveAll(Arrays.asList(new Meal("Chili con Carne and Corn Bread", mainDishes.get(0))
    , new Meal("Baked Chicken and Wild Rice", mainDishes.get(1))
    , new Meal("Baked Fish and Mixed Vegetables", mainDishes.get(2))
    , new Meal("Breaded Pork Chops and Carrots", mainDishes.get(3))));
    return "Meals are bulk created";
  }

  @PostMapping
  public String create(@RequestBody MealUI meal){
    Optional<MainDish> mainDish = mainDishRepository.findById(meal.getMainDishId());
    if (mainDish.isPresent()) {
      mealRepository.save(new Meal(meal.getName(), mainDish.get()));
    } else {
      throw new EntityNotFoundException("MainDish", meal.getMainDishId());
    }
    return "Meal is created";
  }

  @GetMapping
  public List<MealUI> findAll(){
    List<Meal> meals = mealRepository.findAll();
    List<MealUI> mealUI = new ArrayList<>();

    for (Meal meal : meals) {
      mealUI.add(new MealUI(meal.getName(), meal.getMainDish().getId()));
    }

    return mealUI;
  }

  @RequestMapping("/{id}")
  public String search(@PathVariable long id){
    Optional<Meal> meal = mealRepository.findById(id);
    if (meal.isPresent()) {
      return meal.get().toString();
    } else {
      throw new EntityNotFoundException("Meal", id);
    }
  }

  @RequestMapping("/searchbymealname/{mealName}")
  public List<MealUI> fetchDataByMealName(@PathVariable String mealName){
    List<Meal> meals = mealRepository.findByName(mealName);
    List<MealUI> mealUI = new ArrayList<>();

    for (Meal meal : meals) {
      mealUI.add(new MealUI(meal.getName(), meal.getMainDish().getId()));
    }
    return mealUI;
  }
}

package io.catalyte.training.menuplan;

import static org.springframework.boot.SpringApplication.run;

import io.catalyte.training.menuplan.entities.Component;
import io.catalyte.training.menuplan.entities.Dessert;
import io.catalyte.training.menuplan.entities.Ingredient;
import io.catalyte.training.menuplan.entities.MainDish;
import io.catalyte.training.menuplan.entities.Meal;
import io.catalyte.training.menuplan.entities.SideDish;
import io.catalyte.training.menuplan.repositories.DessertRepository;
import io.catalyte.training.menuplan.repositories.IngredientRepository;
import io.catalyte.training.menuplan.repositories.MainDishRepository;
import io.catalyte.training.menuplan.repositories.MealRepository;
import io.catalyte.training.menuplan.repositories.SideDishRepository;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MenuplanApplication {

  public static void main(String[] args) {
    run(MenuplanApplication.class, args);
  }

  @Bean
  public CommandLineRunner populateDatabase(
      MainDishRepository mainDishRepository,
      SideDishRepository sideDishRepository,
      DessertRepository dessertRepository,
      MealRepository mealRepository,
      IngredientRepository ingredientRepository) {
    return (args) -> {
      // Ingredients
      List<Ingredient> ingredientList =
          Stream.of(
                  "Beef, Ground",
                  "Seasoning, Taco",
                  "Vegetables, Mixed",
                  "Flour, All Purpose",
                  "Sugar, Granulated",
                  "Buns, Hamburger",
                  "Rice, Brown",
                  "Cilantro, Dried",
                  "Pie Filling, Cherry",
                  "Pie Crust",
                  "Noodles, Lasagna",
                  "Tomatoes, Diced")
              .map(Ingredient::new)
              .collect(Collectors.toList());
      ingredientRepository.saveAll(ingredientList);
      // Main Dishes
      mainDishRepository.save(
          new MainDish(
              "Tacos",
              new HashSet<>(
                  Arrays.asList(
                      new Component(ingredientRepository.findByName("Beef, Ground"), 1),
                      new Component(ingredientRepository.findByName("Seasoning, Taco"), 8)))));
      mainDishRepository.save(
          new MainDish(
              "Hamburgers",
              new HashSet<>(
                  Arrays.asList(
                      new Component(ingredientRepository.findByName("Beef, Ground"), 1.2),
                      new Component(ingredientRepository.findByName("Buns, Hamburger"), 8)))));
      mainDishRepository.save(
          new MainDish(
              "Lasagna",
              new HashSet<>(
                  Arrays.asList(
                      new Component(ingredientRepository.findByName("Noodles, Lasagna"), 1.2),
                      new Component(ingredientRepository.findByName("Tomatoes, Diced"), 8)))));
      // Side Dishes
      sideDishRepository.save(
          new SideDish(
              "Mixed Vegetables",
              new HashSet<>(
                  Collections.singletonList(
                      new Component(ingredientRepository.findByName("Vegetables, Mixed"), 1.2)))));
      sideDishRepository.save(
          new SideDish(
              "Rice Pilaf",
              new HashSet<>(
                  Arrays.asList(
                      new Component(ingredientRepository.findByName("Rice, Brown"), 1.2),
                      new Component(ingredientRepository.findByName("Cilantro, Dried"), 8)))));
      sideDishRepository.save(
        new SideDish(
          "Garden Salad",
          new HashSet<>(
            Arrays.asList(
              new Component(
                ingredientRepository.findByName("Lettuce, Iceburg"), 1.2),
              new Component(
                ingredientRepository.findByName("Tomato, Cherry"), 8)))));
      // Desserts
      dessertRepository.save(
        new Dessert(
          "Cookies",
          new HashSet<>(
            Arrays.asList(
              new Component(
                ingredientRepository.findByName("Flour, All Purpose"), 1.2),
              new Component(
                ingredientRepository.findByName("Sugar, Granulated"), 8)))));
      dessertRepository.save(
        new Dessert(
          "Cherry Pie",
          new HashSet<>(
            Arrays.asList(
              new Component(
                ingredientRepository.findByName("Pie Filling, Cherry"), 1.2),
              new Component(ingredientRepository.findByName("Pie Crust"), 8)))));
      dessertRepository.save(
        new Dessert(
          "Pudding",
          new HashSet<>(
            Arrays.asList(
              new Component(
                ingredientRepository.findByName("Pudding Mix, Chocolate"), 1.2),
              new Component(
                ingredientRepository.findByName("Oil, Vegetable"), 8)))));
      mealRepository.save(
          new Meal(
              "Tacos, veggies and cookies",
              mainDishRepository.findByName("Tacos"),
              sideDishRepository.findByName("Mixed Vegetables"),
              dessertRepository.findByName("Cookies")));
      mealRepository.save(
          new Meal(
              "Burgers with rice and cherry pie",
              mainDishRepository.findByName("Hamburgers"),
              sideDishRepository.findByName("Rice Pilaf"),
              dessertRepository.findByName("Cherry Pie")));
      mealRepository.save(
          new Meal(
              "Lasagna, salad and Pudding",
              mainDishRepository.findByName("Lasagna"),
              sideDishRepository.findByName("Garden Salad"),
              dessertRepository.findByName("Pudding")));
    };
  }
}

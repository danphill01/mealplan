package io.catalyte.training.menuplan.controllers;

import io.catalyte.training.menuplan.entities.Ingredient;
import io.catalyte.training.menuplan.entities.IngredientUI;
import io.catalyte.training.menuplan.exceptions.ConflictException;
import io.catalyte.training.menuplan.repositories.IngredientRepository;
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

@RequestMapping("/ingredients")
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class IngredientController {
  @Autowired private IngredientRepository repository;

  @GetMapping
  public List<IngredientUI> findAll() {
    List<Ingredient> ingredients = repository.findAll();
    List<IngredientUI> ingredientUI = new ArrayList<>();

    for (Ingredient ingredient : ingredients) {
      ingredientUI.add(new IngredientUI(ingredient.getName()));
    }
    return ingredientUI;
  }

//  @GetMapping("/random")
//  public IngredientUI pickRandomMainDishes() {
//    return service.pickRandom();
//  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Ingredient create(@RequestBody IngredientUI newIngredient) {
    try {
      return repository.save(new Ingredient(newIngredient.getName()));
    } catch (DataIntegrityViolationException dive) {
      throw new ConflictException(dive, "Ingredient", newIngredient.getName());
    }
  }
}

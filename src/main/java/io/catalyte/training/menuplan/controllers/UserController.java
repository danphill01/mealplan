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
import java.security.Principal;
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

@RequestMapping("/user")
@RestController
public class UserController {
  public Principal user(Principal user) {
    return user;
  }
}

package io.catalyte.training.menuplan.controllers;

import io.catalyte.training.menuplan.entities.Dessert;
import io.catalyte.training.menuplan.entities.DessertUI;
import io.catalyte.training.menuplan.repositories.DessertRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/desserts")
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class DessertController {
  @Autowired
  private
  DessertRepository dessertRepository;

  @GetMapping
  public List<DessertUI> findAll() {
    List<Dessert> desserts = dessertRepository.findAll();
    List<DessertUI> dessertUI = new ArrayList<>();

    for (Dessert dessert : desserts) {
      dessertUI.add(new DessertUI(dessert.getName()));
    }
    return dessertUI;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Dessert create(@RequestBody DessertUI newDessert) {
    return dessertRepository.save(new Dessert(newDessert.getName()));
  }

}

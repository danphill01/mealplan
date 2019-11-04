package io.catalyte.training.menuplan.controller;

import io.catalyte.training.menuplan.entities.MainDish;
import io.catalyte.training.menuplan.entities.MainDishUI;
import io.catalyte.training.menuplan.repository.MainDishRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/main")
@RestController
public class MainDishController {
  @Autowired
  MainDishRepository mainDishRepository;

  @GetMapping("/")
  public List<MainDishUI> findAll() {
    List<MainDish> mainDishes = mainDishRepository.findAll();
    List<MainDishUI> mainDishUI = new ArrayList<>();

    for (MainDish mainDish : mainDishes) {
      mainDishUI.add(new MainDishUI(mainDish.getName()));
    }
    return mainDishUI;
  }

}

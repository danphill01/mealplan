package io.catalyte.training.menuplan.services;

import io.catalyte.training.menuplan.entities.MainDish;
import io.catalyte.training.menuplan.entities.MainDishUI;
import io.catalyte.training.menuplan.exceptions.EntityNotFoundException;
import io.catalyte.training.menuplan.repositories.MainDishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@org.springframework.stereotype.Service
public class MainDishServiceImpl implements MainDishService {
  @Autowired private MainDishRepository mainDishRepository;

  @Override
  public MainDishUI pickRandom() {
    long qty = mainDishRepository.count();
    int idx = (int)(Math.random() * qty);
    Page<MainDish> mainDishPage = mainDishRepository.findAll(PageRequest.of(idx, 1));
    MainDish randomMainDish = null;
    if (mainDishPage.hasContent()) {
      randomMainDish = mainDishPage.getContent().get(0);
      return new MainDishUI(randomMainDish.getName(), randomMainDish.getComponent());
    } else {
      throw new EntityNotFoundException("MainDish", idx);
    }
  }
}

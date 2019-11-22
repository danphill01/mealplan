package io.catalyte.training.menuplan.services;

import io.catalyte.training.menuplan.entities.SideDish;
import io.catalyte.training.menuplan.entities.SideDishUI;
import io.catalyte.training.menuplan.exceptions.EntityNotFoundException;
import io.catalyte.training.menuplan.repositories.SideDishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@org.springframework.stereotype.Service
public class SideDishServiceImpl implements SideDishService {
  @Autowired private SideDishRepository sideDishRepository;

  @Override
  public SideDishUI pickRandom() {
    long qty = sideDishRepository.count();
    int idx = (int)(Math.random() * qty);
    Page<SideDish> sideDishPage = sideDishRepository.findAll(PageRequest.of(idx, 1));
    SideDish randomSideDish = null;
    if (sideDishPage.hasContent()) {
      randomSideDish = sideDishPage.getContent().get(0);
      return new SideDishUI(randomSideDish.getName());
    } else {
      throw new EntityNotFoundException("SideDish", idx);
    }
  }
}

package io.catalyte.training.menuplan;

import static org.springframework.boot.SpringApplication.run;

import io.catalyte.training.menuplan.entities.Dessert;
import io.catalyte.training.menuplan.entities.MainDish;
import io.catalyte.training.menuplan.entities.Meal;
import io.catalyte.training.menuplan.entities.SideDish;
import io.catalyte.training.menuplan.repositories.DessertRepository;
import io.catalyte.training.menuplan.repositories.MainDishRepository;
import io.catalyte.training.menuplan.repositories.MealRepository;
import io.catalyte.training.menuplan.repositories.SideDishRepository;
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
    MealRepository mealRepository) {
    return (args) -> {
      mealRepository.save(
        new Meal("Tacos, veggies and cookies",
          mainDishRepository.save(new MainDish("Tacos")),
          sideDishRepository.save(new SideDish("Mixed Vegetables")),
          dessertRepository.save(new Dessert("Cookies"))
        )
      );
      mealRepository.save(
        new Meal("Burgers with rice and cherry pie",
          mainDishRepository.save(new MainDish("Hamburgers")),
          sideDishRepository.save(new SideDish("Rice Pilaf")),
          dessertRepository.save(new Dessert("Cherry Pie"))
        )
      );
      mealRepository.save(
        new Meal("Lasagna, salad and Pudding",
          mainDishRepository.save(new MainDish("Lasagna")),
          sideDishRepository.save(new SideDish("Garden Salad")),
          dessertRepository.save(new Dessert("Pudding"))
        )
      );
    };
  }

}

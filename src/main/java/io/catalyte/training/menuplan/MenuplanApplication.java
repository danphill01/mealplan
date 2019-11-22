package io.catalyte.training.menuplan;

import static org.springframework.boot.SpringApplication.run;

import io.catalyte.training.menuplan.entities.Dessert;
import io.catalyte.training.menuplan.entities.MainDish;
import io.catalyte.training.menuplan.entities.SideDish;
import io.catalyte.training.menuplan.repositories.DessertRepository;
import io.catalyte.training.menuplan.repositories.MainDishRepository;
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
    DessertRepository dessertRepository) {
    return (args) -> {
      mainDishRepository.save(new MainDish("Hamburgers"));
      mainDishRepository.save(new MainDish("Lasagna"));
      mainDishRepository.save(new MainDish("Tacos"));
      sideDishRepository.save(new SideDish("Garden Salad"));
      sideDishRepository.save(new SideDish("Rice Pilaf"));
      sideDishRepository.save(new SideDish("Mixed Vegetables"));
      dessertRepository.save(new Dessert("Pudding"));
      dessertRepository.save(new Dessert("Cookies"));
      dessertRepository.save(new Dessert("Cherry Pie"));
    };
  }

}

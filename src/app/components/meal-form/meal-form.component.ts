import { Component } from '@angular/core';
import { MealService } from 'src/app/services/meal.service';
import { Meal } from 'src/app/models/meal';
import { MainDishService } from 'src/app/services/main-dish.service';
import { DessertService } from 'src/app/services/dessert.service';

@Component({
  selector: 'app-meal-form',
  templateUrl: './meal-form.component.html',
  styleUrls: ['./meal-form.component.css']
})
export class MealFormComponent {

  constructor(
    private mealService: MealService,
    private mainDishService: MainDishService,
    private dessertService: DessertService,
  ) { }

  model: Meal = new Meal('', '', '');

  onSubmit() {
    this.mealService.addMeal(this.model).subscribe();
  }
}

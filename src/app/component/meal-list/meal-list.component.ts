import { Component, OnInit } from '@angular/core';
import { MealService, Meal } from 'src/app/service/meal.service';

@Component({
  selector: 'app-meal-list',
  templateUrl: './meal-list.component.html',
  styleUrls: ['./meal-list.component.css']
})
export class MealListComponent implements OnInit {
  meals: Meal[] = [];

  constructor(
    private mealService: MealService
  ) { }

  ngOnInit() {
    this.mealService.getMeals().subscribe(meals => this.meals = meals);
  }

}

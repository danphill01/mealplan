import { Component, OnInit } from '@angular/core';
import { MealService } from 'src/app/services/meal.service';

@Component({
  selector: 'app-meal-list',
  templateUrl: './meal-list.component.html',
  styleUrls: ['./meal-list.component.css']
})
export class MealListComponent implements OnInit {

  constructor(
    private mealService: MealService,
  ) { }

  ngOnInit() {
  }

}

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';
import { Meal } from '../models/meal';
import { tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class MealService {
  static readonly url: string = `${environment.apiUrl}/mealplans`;
  meals: Meal[] = [];

  constructor(private httpClient: HttpClient) {
    this.fetchMeals().subscribe(meals => this.meals = meals);
  }

  fetchMeals(): Observable<[Meal]> {
    return this.httpClient.get(MealService.url) as Observable<[Meal]>;
  }

  addMeal(newMeal: Meal): Observable<Meal> {
    return this.httpClient.post(MealService.url, newMeal).pipe(
      tap((createdMeal: Meal) => this.meals.push(createdMeal))
    );
  }
}

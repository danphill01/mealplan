import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';

export interface Meal {
  id: number;
  name: string;
}

@Injectable({
  providedIn: 'root'
})
export class MealService {
  static readonly url: string = `${environment.apiUrl}/findall`;
  meals: Meal[] = [];

  constructor(private httpClient: HttpClient) { 
    this.getMeals().subscribe(meals => this.meals = meals);
  }

  getMeals(): Observable<[Meal]> {
    return this.httpClient.get(MealService.url) as Observable<[Meal]>;
  }
}

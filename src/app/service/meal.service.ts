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

  constructor(private httpClient: HttpClient) { }

  getMeals(): Observable<[Meal]> {
    return this.httpClient.get(MealService.url) as Observable<[Meal]>;
  }
}

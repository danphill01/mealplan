import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { tap } from 'rxjs/operators';
import { environment } from '../../environments/environment';
import { MainDish } from '../models/main-dish';

export interface MainDishOption {
  name: string;
}

@Injectable({
  providedIn: 'root'
})
export class MainDishService {
  static readonly url: string = `${environment.apiUrl}/maindishes`;
  mainDishes: MainDish[] = [];

  constructor(private httpClient: HttpClient) {
    this.getMainDishes().subscribe(mainDishes => this.mainDishes = mainDishes);
  }

  getMainDishes(): Observable<[MainDish]> {
    return this.httpClient.get(MainDishService.url).pipe(
      tap((mainList: [MainDish]) => {
        this.mainDishes = mainList;
      })
    );
  }

  addMainDish(newMainDish: MainDish): Observable<MainDish> {
    return this.httpClient.post(MainDishService.url, newMainDish).pipe(
      tap((createdMainDish: MainDish) => this.mainDishes.push(createdMainDish))
    );
  }

  getMainDishOptions(): MainDishOption[] {
    return this.mainDishes.map(mainDish => ({ name: mainDish.name }));
  }

}

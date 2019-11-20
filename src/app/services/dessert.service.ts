import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { tap } from 'rxjs/operators';
import { environment } from '../../environments/environment';
import { Dessert } from '../models/dessert';

export interface DessertOption {
  name: string;
}

@Injectable({
  providedIn: 'root'
})
export class DessertService {
  static readonly url: string = `${environment.apiUrl}/desserts`;
  desserts: Dessert[] = [];

  constructor(private httpClient: HttpClient) {
    this.getDesserts().subscribe(desserts => this.desserts = desserts);
  }

  getDesserts(): Observable<[Dessert]> {
    return this.httpClient.get(DessertService.url) as Observable<[Dessert]>;
  }

  addDessert(newDessert: Dessert): Observable<Dessert> {
    return this.httpClient.post(DessertService.url, newDessert).pipe(
      tap((createdDessert: Dessert) => this.desserts.push(createdDessert))
    );
  }

  getDessertOptions(): DessertOption[] {
    return this.desserts.map(dessert => ({ name: dessert.name }));
  }
}

import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { SideDish } from '../models/side-dish';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface SideDishOption {
  name: string;
}

@Injectable({
  providedIn: 'root'
})
export class SideDishService {
  static readonly url: string = `${environment.apiUrl}/sidedishes`;
  sideDishList: SideDish[] = [];

  constructor(private httpClient: HttpClient) {
    this.getSideDishes().subscribe((sideList: [SideDish]) => {
      this.sideDishList = sideList;
    });
  }

  getSideDishes(): Observable<[SideDish]> {
    return this.httpClient.get(SideDishService.url) as Observable<[SideDish]>;
  }
}

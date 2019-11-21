import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { SideDish } from '../models/side-dish';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { tap } from 'rxjs/operators';

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
    this.getSideDishes().subscribe(sideDishes => this.sideDishList = sideDishes);
  }

  getSideDishes(): Observable<[SideDish]> {
    return this.httpClient.get(SideDishService.url) as Observable<[SideDish]>;
  }

  addSideDish(newSideDish: SideDish): Observable<SideDish> {
    return this.httpClient.post(SideDishService.url, newSideDish).pipe(
      tap((createdSideDish: SideDish) => this.sideDishList.push(createdSideDish))
    );
  }

  getSideDishOptions(): SideDishOption[] {
    return this.sideDishList.map(sideDish => ({ name: sideDish.name }));
  }
}

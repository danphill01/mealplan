import { Component } from '@angular/core';
import { MainDishService } from 'src/app/services/main-dish.service';

@Component({
  selector: 'app-main-dish-list',
  template: `
    <app-entity-list
      pageHeader="Main Dish List"
      [entityList]="this.service.mainDishList">
    </app-entity-list>
    <app-main-dish-form></app-main-dish-form>
  `,
})
export class MainDishListComponent {

  constructor(private service: MainDishService) { }

}

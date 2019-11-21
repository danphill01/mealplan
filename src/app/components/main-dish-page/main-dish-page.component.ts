import { Component } from '@angular/core';
import { MainDishService } from 'src/app/services/main-dish.service';
import { MainDish } from 'src/app/models/main-dish';

@Component({
  selector: 'app-main-dish-page',
  template: `
    <app-entity-list
      pageHeader="Main Dish List"
      [entityList]="this.service.mainDishList">
    </app-entity-list>
    <app-add-recipe-form [model]="this.model" (addEntityRequest)="addMainDish()"></app-add-recipe-form>
  `,
})
export class MainDishPageComponent {
  model: MainDish = new MainDish('');

  constructor(private service: MainDishService) { }

  addMainDish(): void {
    this.service.addMainDish(this.model).subscribe();
  }
}

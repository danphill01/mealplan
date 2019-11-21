import { Component } from '@angular/core';
import { SideDishService } from 'src/app/services/side-dish.service';
import { SideDish } from 'src/app/models/side-dish';

@Component({
  selector: 'app-side-dish-list',
  template: `
    <app-entity-list
      pageHeader="Side Dish List"
      [entityList]="this.service.sideDishList">
    </app-entity-list>
    <app-add-recipe-form [model]="this.model" (addEntityRequest)="addSideDish()"></app-add-recipe-form>
  `,
})
export class SideDishPageComponent {
  model: SideDish = new SideDish('');

  constructor(private service: SideDishService) { }

  addSideDish(): void {
    this.service.addSideDish(this.model).subscribe();
  }
}

import { Component } from '@angular/core';
import { SideDishService } from 'src/app/services/side-dish.service';

@Component({
  selector: 'app-side-dish-list',
  template: `
    <app-entity-list
      pageHeader="Side Dish List"
      [entityList]="this.service.sideDishList">
    </app-entity-list>
  `,
})
export class SideDishListComponent {

  constructor(private service: SideDishService) { }

}

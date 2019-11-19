import { Component } from '@angular/core';
import { DessertService } from 'src/app/services/dessert.service';
import { Dessert } from 'src/app/models/dessert';

@Component({
  selector: 'app-dessert-form',
  templateUrl: './dessert-form.component.html',
  styleUrls: ['./dessert-form.component.css']
})
export class DessertFormComponent {

  constructor(private dessertService: DessertService) { }

  model: Dessert = new Dessert('');

  onSubmit() {
    this.dessertService.addDessert(this.model).subscribe();
  }
}

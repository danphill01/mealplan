import { Component } from '@angular/core';
import { MainDish } from 'src/app/models/main-dish';
import { MainDishService } from 'src/app/services/main-dish.service';

@Component({
  selector: 'app-main-dish-form',
  templateUrl: './main-dish-form.component.html',
  styleUrls: ['./main-dish-form.component.css']
})
export class MainDishFormComponent {

  constructor(private mainDishService: MainDishService) { }

  model: MainDish = new MainDish('');

  onSubmit() {
    this.mainDishService.addMainDish(this.model).subscribe();
  }

}

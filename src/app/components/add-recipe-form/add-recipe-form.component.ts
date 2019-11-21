import { Component, Input, Output, EventEmitter } from '@angular/core';
import { Recipe } from 'src/app/models/recipe';

@Component({
  selector: 'app-add-recipe-form',
  templateUrl: './add-recipe-form.component.html',
})
export class AddRecipeFormComponent {
  @Input() model: Recipe;
  @Output() addEntityRequest = new EventEmitter();

  constructor() { }

  onSubmit(): void {
    this.addEntityRequest.emit();
  }
}

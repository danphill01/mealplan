import { Recipe } from './recipe';

export class Meal implements Recipe {

  constructor(
    public name: string,
    public mainDishName: string,
    public sideDishName: string,
    public dessertName: string,
  ) { }

}

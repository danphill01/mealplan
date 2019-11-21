import { Recipe } from './recipe';

export class MainDish implements Recipe {
  constructor(
    public name: string,
  ) {}
}

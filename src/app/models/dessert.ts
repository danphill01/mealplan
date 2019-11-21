import { Recipe } from './recipe';

export class Dessert implements Recipe {
  constructor(
    public name: string,
  ) {}
}

import { Meal } from './meal';

describe('Meal', () => {
  it('should create an instance', () => {
    expect(new Meal('meal name', 'main-dish name', 'side-dish name', 'dessert name')).toBeTruthy();
  });
});

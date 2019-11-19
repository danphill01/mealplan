import { TestBed } from '@angular/core/testing';

import { MainDishService } from './main-dish.service';

describe('MainDishService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: MainDishService = TestBed.get(MainDishService);
    expect(service).toBeTruthy();
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MainDishListComponent } from './main-dish-list.component';

describe('MainDishListComponent', () => {
  let component: MainDishListComponent;
  let fixture: ComponentFixture<MainDishListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MainDishListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MainDishListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

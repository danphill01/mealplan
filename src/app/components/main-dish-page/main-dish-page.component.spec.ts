import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MainDishPageComponent } from './main-dish-page.component';

describe('MainDishPageComponent', () => {
  let component: MainDishPageComponent;
  let fixture: ComponentFixture<MainDishPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MainDishPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MainDishPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

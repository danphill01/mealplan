import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MainDishFormComponent } from './main-dish-form.component';

describe('MainDishFormComponent', () => {
  let component: MainDishFormComponent;
  let fixture: ComponentFixture<MainDishFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MainDishFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MainDishFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

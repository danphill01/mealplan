import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DessertFormComponent } from './dessert-form.component';

describe('DessertFormComponent', () => {
  let component: DessertFormComponent;
  let fixture: ComponentFixture<DessertFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DessertFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DessertFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

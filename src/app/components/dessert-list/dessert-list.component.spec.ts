import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DessertListComponent } from './dessert-list.component';

describe('DessertListComponent', () => {
  let component: DessertListComponent;
  let fixture: ComponentFixture<DessertListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DessertListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DessertListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

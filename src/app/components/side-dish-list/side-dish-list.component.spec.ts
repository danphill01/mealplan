import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SideDishListComponent } from './side-dish-list.component';

describe('SideDishComponent', () => {
  let component: SideDishListComponent;
  let fixture: ComponentFixture<SideDishListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SideDishListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SideDishListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SideDishPageComponent } from './side-dish-page.component';

describe('SideDishComponent', () => {
  let component: SideDishPageComponent;
  let fixture: ComponentFixture<SideDishPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SideDishPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SideDishPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

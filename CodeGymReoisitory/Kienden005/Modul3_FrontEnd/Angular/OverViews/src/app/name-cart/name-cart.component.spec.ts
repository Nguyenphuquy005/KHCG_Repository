import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NameCartComponent } from './name-cart.component';

describe('NameCartComponent', () => {
  let component: NameCartComponent;
  let fixture: ComponentFixture<NameCartComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NameCartComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NameCartComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

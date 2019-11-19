import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { MealListComponent } from './components/meal-list/meal-list.component';
import { MainDishListComponent } from './components/main-dish-list/main-dish-list.component';
import { MainDishFormComponent } from './components/main-dish-form/main-dish-form.component';
import { DessertListComponent } from './components/dessert-list/dessert-list.component';
import { DessertFormComponent } from './components/dessert-form/dessert-form.component';

@NgModule({
  declarations: [
    AppComponent,
    MealListComponent,
    MainDishListComponent,
    MainDishFormComponent,
    DessertListComponent,
    DessertFormComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

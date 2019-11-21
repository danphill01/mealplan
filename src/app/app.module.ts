import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { MealListComponent } from './components/meal-list/meal-list.component';
import { MainDishPageComponent } from './components/main-dish-page/main-dish-page.component';
import { AddRecipeFormComponent } from './components/add-recipe-form/add-recipe-form.component';
import { DessertListComponent } from './components/dessert-list/dessert-list.component';
import { DessertFormComponent } from './components/dessert-form/dessert-form.component';
import { AppRoutingModule } from './app-routing.module';
import { MealFormComponent } from './components/meal-form/meal-form.component';
import { SideDishPageComponent } from './components/side-dish-page/side-dish-page.component';
import { EntityListComponent } from './components/entity-list/entity-list.component';

@NgModule({
  declarations: [
    AppComponent,
    MealListComponent,
    MainDishPageComponent,
    AddRecipeFormComponent,
    DessertListComponent,
    DessertFormComponent,
    MealFormComponent,
    SideDishPageComponent,
    EntityListComponent
  ],
  imports: [
    AppRoutingModule,
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

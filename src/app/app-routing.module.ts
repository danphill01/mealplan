import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MealListComponent } from './components/meal-list/meal-list.component';
import { MainDishPageComponent } from './components/main-dish-page/main-dish-page.component';
import { DessertListComponent } from './components/dessert-list/dessert-list.component';
import { SideDishPageComponent } from './components/side-dish-page/side-dish-page.component';

const routes: Routes = [
  { path: '', redirectTo: '/meals', pathMatch: 'full' },
  { path: 'meals', component: MealListComponent },
  { path: 'main-dishes', component: MainDishPageComponent },
  { path: 'side-dishes', component: SideDishPageComponent },
  { path: 'desserts', component: DessertListComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

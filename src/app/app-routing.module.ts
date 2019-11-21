import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MealListComponent } from './components/meal-list/meal-list.component';
import { MainDishListComponent } from './components/main-dish-list/main-dish-list.component';
import { DessertListComponent } from './components/dessert-list/dessert-list.component';
import { SideDishListComponent } from './components/side-dish-list/side-dish-list.component';

const routes: Routes = [
  { path: '', redirectTo: '/meals', pathMatch: 'full' },
  { path: 'meals', component: MealListComponent },
  { path: 'main-dishes', component: MainDishListComponent },
  { path: 'side-dishes', component: SideDishListComponent },
  { path: 'desserts', component: DessertListComponent },
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
